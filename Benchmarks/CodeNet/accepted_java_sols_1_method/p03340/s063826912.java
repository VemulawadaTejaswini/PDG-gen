import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
    }

    long sum = 0;
    long count = 0;
    int xor = 0;
    int left = 0;
    for (int right = 1; right <= N; right++) {
      sum += A[right - 1];
      xor ^= A[right - 1];
      if (sum == xor) {
        count += right - left;
        continue;
      }
      while (sum != xor) {
        sum -= A[left];
        xor ^= A[left];
        left++;
      }
      count += right - left;
    }
    System.out.println(count);
  }
}
