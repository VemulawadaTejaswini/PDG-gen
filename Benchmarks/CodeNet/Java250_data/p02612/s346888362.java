// 2回目の提出
// 1回目の提出は、 n = 200 とか 1000 の 約数が n として入力された時に 0 を出力する為ng
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      // 解く
      int ans = 10_000 - n;

      if(ans!=0)
        ans = ans % 1000;

      System.out.println(ans);
    }
}