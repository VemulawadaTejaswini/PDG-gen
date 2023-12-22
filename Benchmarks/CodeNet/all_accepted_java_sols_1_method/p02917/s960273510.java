import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] B = new int[N - 1];
    for (int i = 0; i < B.length; i++) {
      B[i] = sc.nextInt();
    }

    int next = B[0];
    int ans = B[0];
    for (int i = 1; i < B.length; i++) {
      int cur = Math.min(next, B[i]);
      ans += cur;
      next = B[i];
    }
    ans += next;
    System.out.println(ans);
  }
}
