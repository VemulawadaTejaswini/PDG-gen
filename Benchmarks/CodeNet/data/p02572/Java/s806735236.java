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

    var k = 0;
    long ans = 0;

    long MOD = 1000000007;

    for (var i = 0;i<N-1;i++){
      for ( var j = i+1;j<N;j++){
        ans += (Long.parseLong(A[i]) * Long.parseLong(A[j])) % MOD;
      }
    }

    ans %= MOD;

    System.out.println(ans);
    scan.close();
  }
}