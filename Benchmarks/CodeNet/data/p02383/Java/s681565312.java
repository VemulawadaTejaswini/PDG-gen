import java.util.Scanner;

class Dice {
  public int label1;
  public int label2;
  public int label3;
  public int label4;
  public int label5;
  public int label6;

  Dice (int lebel1, int label2, int label3, int label4, int label5, int label6) {
    this.label1 = label1; this.label2 = label2; this.label3 = label3;
    this.label4 = label4; this.label5 = label5; this.label6 = label6;
  }

  void moveToNorth() {
    int tmp = label1;

    label1 = label2;
    label2 = label6;
    label6 = label5;
    label5 = tmp;
  }

  void moveToEast() {
    int tmp = label1;

    label1 = label4;
    label4 = label6;
    label6 = label3;
    label3 = tmp;
  }

  void moveToSouth() {
    int tmp = label1;

    label1 = label5;
    label5 = label6;
    label6 = label2;
    label2 = tmp;
  }

  void moveToWest() {
    int tmp = label1;
    label1 = label3;
    label3 = label6;
    label6 = label4;
    label4 = tmp;
  }

  int printLabel1() {
    return label1;
  }
}

class Dice1 {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[] t = new int[6];
    for (int i = 0; i < 6; i++)
      t[i] = stdIn.nextInt();

    Dice dice = new Dice(t[0], t[1], t[2], t[3], t[4], t[5]);

    String command = stdIn.next();

    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'N')
        dice.moveToNorth();
      else if (command.charAt(i) == 'E')
        dice.moveToEast();
      else if (command.charAt(i) == 'S')
        dice.moveToSouth();
      else if (command.charAt(i) == 'W')
        dice.moveToWest();
    }

    System.out.println(dice.printLabel1());
  }
}