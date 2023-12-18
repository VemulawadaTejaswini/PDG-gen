import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n + 1];
    Arrays.setAll(A, i -> sc.nextInt());
    long result = 0;
    int b;
    for (int i = 0; i < n; i++) {
      b = sc.nextInt();
      if (b > A[i]) {
        result += A[i];
        b -= A[i];
        result += Math.min(A[i + 1], b);
        A[i + 1] = Math.max(0, A[i + 1] - b);
      } else
        result += b;
    }
    System.out.println(result);
  }
}