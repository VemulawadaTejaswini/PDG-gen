import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] num = new int[1001];
    for (int i = 2; i <= N; i++) {
      int tmp = i;
      for (int j = 2; j <= tmp; j++) {
        while (tmp % j == 0) {
          num[j]++;
          tmp /= j;
        }
      }
    }
    long ans = 1;
    for (int i = 2; i <= 1000; i++) {
      ans *= num[i] + 1;
      ans = ans % 1000000007;
    }
    System.out.println(ans);
  }
}