import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ai = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      int a = sc.nextInt();
      ai[a] = i;
    }

    for (int i = 1; i <= n; i++) {
      int i1 = ai[i];
      System.out.print(i1);
      System.out.print(i == n ? "\n" : " ");
    }
  }
}
