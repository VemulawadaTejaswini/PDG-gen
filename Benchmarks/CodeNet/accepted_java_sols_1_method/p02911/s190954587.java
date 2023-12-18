import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] A = new int[N];
    int sum = 0;
    for (int i = 0; i < Q; i++) {
      A[sc.nextInt()-1]++;
      sum++;
    }
    for (int i = 0; i < N; i++) {
      if (sum - A[i] >= K) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
  }
}
