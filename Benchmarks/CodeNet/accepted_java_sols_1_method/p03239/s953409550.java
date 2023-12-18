import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int cost = sc.nextInt();
      int time = sc.nextInt();
      if (T >= time) {
        min = Math.min(cost, min);
      }
    }
    if (min == 2147483647) {
      System.out.println("TLE");
    } else {
      System.out.println(min);
    }
  }
}
