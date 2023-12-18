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
  public static void assign(int a, int b, int c, int d, int e, int f) {
    up = a;
    back = b;
    right = c;
    left = d;
    forward = e;
    down = f;
  }
  public static int returnRight(int a, int b) {
    if((a == left && b == back) || (a == forward && b == left) || (a == right && b == forward)
      || (a == back && b == right)) {
      return up;
    } else if((a == up && b == left) || (a == right && b == up) || (a == down && b == right)
      || (a == left && b == down)) {
      return back;
    } else if((a == up && b == back) || (a == forward && b == up) || (a == down && b == forward)
      || (a == back && b == down)) {
      return right;
    } else if((a == up && b == forward) || (a == back && b == up) || (a == down && b == back)
      || (a == forward && b == down)) {
      return left;
    } else if((a == up && b == right) || (a == left && b == up) || (a == down && b == left)
      || (a ==right && b == down)) {
      return forward;
    } else {
      return down;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dice = new int[6];
    for(int i = 0; i < 6; i++) {
      dice[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    assign(dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(returnRight(a, b));
    }
  }
}

