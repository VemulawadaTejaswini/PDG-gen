import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    int[] h = new int[N + 1];
    while (++cnt <= N) {
      h[cnt] = sc.nextInt();
    }
    int[] min = new int[N + 1];
    Arrays.fill(min, Integer.MAX_VALUE / 2);
    min[1] = 0;
    for (int i = 2; i < min.length; i++) {
      min[i] = Math.min(
              min[i-2] + Math.abs(h[i] - h[i-2]),
              min[i-1] + Math.abs(h[i]- h[i-1]));
    }
    System.out.println(min[N]);
  }
}