import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int[] a =IntStream.range(0, n)
        .map(i -> scanner.nextInt())
        .toArray();

      int sum = Arrays.stream(a).sum();
      a = Arrays.stream(a).map(i -> i * n).toArray();
      
      int mini = 999;
      int ans = 999;
      for (int i = n - 1; i >= 0; i--) {
        int diff = Math.abs(a[i] - sum);
        if (diff <= mini) {
          mini = diff;
          ans = i;
        }
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
