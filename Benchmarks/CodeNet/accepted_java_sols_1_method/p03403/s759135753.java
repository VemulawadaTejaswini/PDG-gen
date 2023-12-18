import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int[] A = new int[N + 2];
    A[0] = 0;
    A[N + 1] = 0;
    long[] sum = new long[N + 2];
    for (int i = 1; i <= N; i++) {
      A[i] = Integer.parseInt(scanner.next());
    }
    for (int i = 0; i <= N; i++) {
      sum[i + 1] = sum[i] + Math.abs(A[i + 1] - A[i]);
    }
    scanner.close();

    for (int i = 1; i <= N; i++) {
      System.out.println(sum[N + 1] - (sum[i + 1] - sum[i - 1]) + Math.abs(A[i + 1] - A[i - 1]));
    }

  }

}
