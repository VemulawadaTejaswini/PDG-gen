import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int[] temp = new int[6];
    for (int i = 0; i < 6; i++) {
      temp[i] = reader.nextInt();
    }
    Dice dice1 = new Dice(temp);
    char[] order = reader.next().toCharArray();
    for (int i = 0; i < order.length; i++) {
      dice1.roll(order[i]);
    }
    dice1.printTop();
  }
}

class Dice {
  int[] number = new int[6];
  int[] surface = new int[3];

  public Dice(int[] number) {
    for (int i = 0; i < 6; i++) {
      this.number[i] = number[i];
    }
    this.surface[0] = 0;
    this.surface[1] = 1;
    this.surface[2] = 2;
  }

  public void roll(char order) {
    int temp;
    if (order == 'N') {
      temp = this.surface[0];
      this.surface[0] = this.surface[1];
      this.surface[1] = 5 - temp;
    }
    else if (order == 'S') {
      temp = this.surface[1];
      this.surface[1] = this.surface[0];
      this.surface[0] = 5 - temp;
    }
    else if (order == 'E') {
      temp = this.surface[2];
      this.surface[2] = this.surface[0];
      this.surface[0] = 5 - temp;
    }
    else if (order == 'W') {
      temp = this.surface[0];
      this.surface[0] = this.surface[2];
      this.surface[2] = 5 - temp;
    }
  }

  public void printTop() {
    System.out.println(this.number[this.surface[0]]);
  }
}