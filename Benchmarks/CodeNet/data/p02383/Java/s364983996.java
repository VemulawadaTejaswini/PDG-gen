import java.util.Scanner

   fun main(args:Array<String>) {
    val scan = Scanner(System.`in`)
    val DICE = 6
    var dice = IntArray(DICE)
    var dice2 = IntArray(DICE)
       
    for (i in 0 until DICE)
    {
      val number: Int = scan.nextInt()  
      dice[i] = number
    }
    val direction = scan.next()
    scan.close()
    for (i in 0 until direction.length)
    {
      when (direction.get(i)) {
        'N' -> {
          dice2[0] = dice[1]
          dice2[1] = dice[5]
          dice2[2] = dice[2]
          dice2[3] = dice[3]
          dice2[4] = dice[0]
          dice2[5] = dice[4]
        }
        'E' -> {
          dice2[0] = dice[3]
          dice2[1] = dice[1]
          dice2[2] = dice[0]
          dice2[3] = dice[5]
          dice2[4] = dice[4]
          dice2[5] = dice[2]
        }
        'S' -> {
          dice2[0] = dice[4]
          dice2[1] = dice[0]
          dice2[2] = dice[2]
          dice2[3] = dice[3]
          dice2[4] = dice[5]
          dice2[5] = dice[1]
        }
        'W' -> {
          dice2[0] = dice[2]
          dice2[1] = dice[1]
          dice2[2] = dice[5]
          dice2[3] = dice[0]
          dice2[4] = dice[4]
          dice2[5] = dice[3]
        }
        else -> {}
      }
      for (j in 0 until DICE)
      {
        dice[j] = dice2[j]
      }
    }
    println(dice[0])
  }




