import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int[] temp = new int[6];
    for (int i = 0; i < 6; i++) {
      temp[i] = reader.nextInt();
    }

    int n = reader.nextInt();
    for (int i = 0; i < n; i++) {
      int t = reader.nextInt();
      int f = reader.nextInt();
      Dice dice = new Dice(temp);

      if (t == dice.number[1]) {
        dice.roll('N');
      }
      else if (t == dice.number[2]) {
        dice.roll('W');
      }
      else if (t == dice.number[3]) {
        dice.roll('E');
      }
      else if (t == dice.number[4]) {
        dice.roll('S');
      }
      else if (t == dice.number[5]) {
        dice.roll('W');
        dice.roll('W');
      }

      while (dice.number[dice.surface[1]] != f) {
        dice.roll('r');
      }
      System.out.println(dice.number[dice.surface[2]]);
    }
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
    else if (order == 'r') {
      temp = this.surface[1];
      this.surface[1] = this.surface[2];
      this.surface[2] = 5 - temp;
    }
  }
}