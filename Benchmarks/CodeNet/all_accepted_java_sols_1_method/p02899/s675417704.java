import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] ans = new int[N];
    for (int id = 1; id <= N; id++) {
      int num = sc.nextInt();
      ans[num - 1] = id;
    }
    System.out.print(ans[0]);
    for (int i = 1; i < N; i++) {
      System.out.print(" " + ans[i]);
    }
  }
}
