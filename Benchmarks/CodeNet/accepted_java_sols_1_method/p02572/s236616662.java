import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備するよ！
      long mod = 1_000_000_000 + 7;

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int i=0; i<n; ++i) a[i] = sc.nextLong();

      // 解くよ！
      long ruiseki = 0;
      long ans = 0;
      for(int i=0; i<n; ++i) {
        ans     = (ans + a[i] * ruiseki) % mod;
        ruiseki = (a[i] + ruiseki) % mod;
      }

      System.out.println(ans);

    }
}