import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var N = Integer.parseInt(str_scan);

    String str_scan2 = scan.nextLine();
    // スペース区切りで分ける
    var A = str_scan2.split(" ");
    long[] work = new long[N];
    long base_sum = 0;

    //long型に変換&&基本の和を求める
    for (var x = 0;x < N;x++){
      work[x] = Long.parseLong(A[x]);
      base_sum += work[x];
    }

    long ans = 0;

    long MOD = 1000000007;

    long sum = 0;
    long hiku = 0;

    for (var i = 0;i < N-1;i++){
      hiku += work[i];
      sum = base_sum - hiku;
      ans += work[i] * sum % MOD;
    }

    ans %= MOD;

    System.out.println(ans);
    scan.close();
  }
}