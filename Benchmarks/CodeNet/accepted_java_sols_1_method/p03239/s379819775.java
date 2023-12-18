import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int T = Integer.parseInt(sc.next());

    int minCost = 2000;

    for (int i = 0; i < N; i++) {
      int c = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      if (t <= T && c < minCost) {
        minCost = c;
      }
    }
    if (minCost > 1000) {
      System.out.println("TLE");
    } else {
      System.out.println(minCost);
    }

  }
}