import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] n = new int[6];
    for (int i = 0; i < 6; i++) {
      n[i] = reader.nextInt();
    }
    Dice dice1 = new Dice(n);
    for (int i = 0; i < 6; i++) {
      n[i] = reader.nextInt();
    }
    Dice dice2 = new Dice(n);
    if (dice1.checkSame(dice2)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}

class Dice {
  int[] surface = new int[6];

  public Dice(int[] n) {
    for (int i = 0; i < 6; i++) {
      this.surface[i] = n[i];
    }
  }

  public void roll(String order) {
    if (order.equals("N")) {
      int temp = this.surface[0];
      this.surface[0] = this.surface[1];
      this.surface[1] = this.surface[5];
      this.surface[5] = this.surface[4];
      this.surface[4] = temp;
    }
    else if (order.equals("S")) {
      int temp = this.surface[0];
      this.surface[0] = this.surface[4];
      this.surface[4] = this.surface[5];
      this.surface[5] = this.surface[1];
      this.surface[1] = temp;
    }
    else if (order.equals("E")) {
      int temp = this.surface[0];
      this.surface[0] = this.surface[3];
      this.surface[3] = this.surface[5];
      this.surface[5] = this.surface[2];
      this.surface[2] = temp;
    }
    else if (order.equals("W")) {
      int temp = this.surface[0];
      this.surface[0] = this.surface[2];
      this.surface[2] = this.surface[5];
      this.surface[5] = this.surface[3];
      this.surface[3] = temp;
    }
    else if (order.equals("R")) {
      int temp = this.surface[1];
      this.surface[1] = this.surface[2];
      this.surface[2] = this.surface[4];
      this.surface[4] = this.surface[3];
      this.surface[3] = temp;
    }
  }

  public boolean checkSame(Dice dice) {
    if (this.surface[0] == dice.surface[0]) {
    }
    else if (this.surface[0] == dice.surface[1]) {
      dice.roll("N");
    }
    else if (this.surface[0] == dice.surface[2]) {
      dice.roll("W");
    }
    else if (this.surface[0] == dice.surface[3]) {
      dice.roll("E");
    }
    else if (this.surface[0] == dice.surface[4]) {
      dice.roll("S");
    }
    else if (this.surface[0] == dice.surface[5]) {
      dice.roll("W");
      dice.roll("W");
    }
    else {
      return false;
    }

    int n;
    if (this.surface[1] == dice.surface[1]) {
      n = 0;
    }
    else if (this.surface[1] == dice.surface[2]) {
      n = 1;
    }
    else if (this.surface[1] == dice.surface[3]) {
      n = 3;
    }
    else if (this.surface[1] == dice.surface[4]) {
      n = 2;
    }
    else {
      return false;
    }

    for (int i = 0; i < n; i++) {
      dice.roll("R");
    }

    for (int i = 2; i < 6; i++) {
      if (this.surface[i] != dice.surface[i]) {
        return false;
      }
    }
    return true;
  }
}