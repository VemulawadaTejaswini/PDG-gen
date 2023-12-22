import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] ints = new int[N];
    for (int i = 0; i < Q; i++) {
      ints[sc.nextInt() - 1]++;
    }
    for (int i = 0; i < N; i++) {
      System.out.println((K - Q + ints[i] > 0) ? "Yes" : "No");
    }
  }
}
