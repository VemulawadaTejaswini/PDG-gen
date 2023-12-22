import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] costs = new int[N];
    int[] time = new int[N];
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      costs[i] = sc.nextInt();
      time[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      if (time[i] <= T) {
        min = Math.min(min, costs[i]);
      }
    }

    if (min == Integer.MAX_VALUE) {
      System.out.println("TLE");
    } else {
      System.out.println(min);
    }
  }
}
