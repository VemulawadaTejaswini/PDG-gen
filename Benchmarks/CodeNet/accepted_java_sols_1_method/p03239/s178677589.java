import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    
    int minCost = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int c = sc.nextInt();
      int t = sc.nextInt();
      if (t <= T && c < minCost) {
        minCost = c;
      }
    }
    if (minCost == Integer.MAX_VALUE) {
      System.out.println("TLE");
    } else {
      System.out.println(minCost);
    }
  }
}