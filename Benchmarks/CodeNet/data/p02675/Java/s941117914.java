import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object Main extends App {
  val n = StdIn.readInt()
  val d = n / 10
  if (d == 3) println("pon")
  else if (List(0, 1, 6, 8).contains(d)) println("bon")
  else println("hon")


  def readIntPair: (Int, Int) = {
    val Array(x, y) = StdIn.readLine().split(" ").map(_.toInt)
    (x, y)
  }

  def readIntArr = StdIn.readLine().split(" ").map(_.toInt)
}




