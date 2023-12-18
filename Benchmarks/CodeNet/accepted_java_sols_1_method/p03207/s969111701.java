import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] p = new int[N];
      int max = 0,sum = 0;
      for (int i = 0; i < N; i++) {
        p[i] = sc.nextInt();
        sum += p[i];
        max = Math.max(max, p[i]);
      }
      System.out.println(sum - max / 2);
    }
  }
}