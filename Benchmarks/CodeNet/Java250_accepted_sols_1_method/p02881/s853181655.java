import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int sN = (int) Math.sqrt(N);
    long ans = Long.MAX_VALUE;
    for (int di = 1; di <= sN; di++) {
      long dj = N / di;
      if (di * dj == N) {
        ans = Math.min(ans, di - 1 + dj - 1);
      }
    }
    System.out.println(ans);
  }
}
