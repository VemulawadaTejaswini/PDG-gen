object Main extends App {

  val Array(n, m, l) = io.StdIn.readLine().split(" ").map(_.toInt)

  val a = Array.ofDim[Int](n,m)
  val b = Array.ofDim[Int](m,l)
  for(i <- 0 until n)
    a(i) = io.StdIn.readLine().split(" ").map(_.toInt)
  for(i <- 0 until m)
    b(i) = io.StdIn.readLine().split(" ").map(_.toInt)

  val ans: Array[Array[Long]] = Array.ofDim[Long](n,l)
  for(i <- 0 until n; j <- 0 until l)
    ans(i)(j) = (0 until m).foldLeft(0) {
      (acc,k) => acc + a(i)(k) * b(k)(j)
    }

  val sb = StringBuilder.newBuilder
  for(e <- ans)
    sb.append(e.mkString(" ")).append("\n")
  println(sb)
}
