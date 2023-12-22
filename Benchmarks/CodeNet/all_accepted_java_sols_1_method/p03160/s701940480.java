
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] str = sc.nextLine().split(" ");
    int[] ans = new int[N];
    ans[0] = 0;
    for (int i = 1; i < N; i++) {
      ans[i] = Integer.MAX_VALUE;
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j <= i + 2 && j < N; j++) {
        ans[j] = Math.min(ans[j], Math.abs(Integer.parseInt(str[j]) - Integer.parseInt(str[i]))+ans[i]);
      }
    }
    System.out.println(ans[N - 1]);
  }
}
