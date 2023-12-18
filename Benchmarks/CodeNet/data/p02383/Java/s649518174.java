import java.util.*;

public class Main {
  public static int forward = 5;
  public static int back = 2;
  public static int right = 3;
  public static int left = 4;
  public static int up = 1;
  public static int down = 6;

  public static void north() {
    int a = forward;
    forward = up;
    up = back;
    back = down;
    down = a;
  }
  public static void east() {
    int a = right;
    right = up;
    up = left;
    left = down;
    down = a;
  }
  public static void south() {
    int a = back;
    back = up;
    up = forward;
    forward = down;
    down = a;
  }
  public static void west() {
    int a = left;
    left = up;
    up = right;
    right = down;
    down = a;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dice = new int[6];
    for(int i = 0; i < 6; i++) {
      dice[i] = sc.nextInt();
    }
    sc.nextLine();
    String[] direction = sc.nextLine().split("");
    for(int i = 0; i < direction.length; i++) {
      if(direction[i].equals("N")) {
        north();
      } else if(direction[i].equals("E")) {
        east();
      } else if(direction[i].equals("S")) {
        south();
      } else {
        west();
      }
    }
    System.out.println(dice[up - 1]);
  }
}

