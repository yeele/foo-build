ThisBuild / scalaVersion := "2.12.7"


lazy val hello = taskKey[Unit]("An example task")

lazy val miso = settingKey[String]("Soup")

lazy val root = (project in file("."))
  .settings(
    hello := { println("Hello!") },
    miso := "Soup!"
  )



