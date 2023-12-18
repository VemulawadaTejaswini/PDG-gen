object Main {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9; j <- 1 to 9)
      println(i + "x" + j + "=" + i * j)
  }
}