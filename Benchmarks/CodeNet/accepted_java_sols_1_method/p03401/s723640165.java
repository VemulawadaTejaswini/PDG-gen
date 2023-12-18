import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N + 2];
    long sum = 0;
    A[0] = 0;
    A[N + 1] = 0;
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
      sum += Math.abs(A[i] - A[i - 1]);
    }
    sum += Math.abs(A[N + 1] - A[N]);

    for (int i = 1; i <= N; i++) {
      int add = Math.abs(A[i - 1] - A[i + 1]);
      int sub = Math.abs(A[i - 1] - A[i]) + Math.abs(A[i] - A[i + 1]);
      System.out.println(sum + add - sub);
    }
  }
}