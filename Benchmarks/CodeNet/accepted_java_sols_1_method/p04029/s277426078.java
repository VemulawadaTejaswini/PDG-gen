import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 標準入力から子どもの人数を取得
    int number = scanner.nextInt();

    // N人の子どもそれぞれについてキャンディーの数を足していく
    int sum = 0; // *キャンディーの個数（初期値は0）
	for(int i = 1; i <= number; i++) {
      sum += i;
    }

    // キャンディーの合計数を出力
    System.out.println(sum);
  }
}