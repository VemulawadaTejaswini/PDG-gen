
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int sum_digit = 0;
		int j;

		//1からn(iとする)まで繰り返す
		for (int i = 1; i <= n; i++) {
//			System.out.println(i+"回目");
			//jの各桁の和を計算(sum_digitとする)
			//自然数の各桁の和を計算
			j = i;
			while (j != 0) {
				//sumDigitsは単独ではloopしないので、while loopを使う。
				sum_digit += j % 10;
				//再右端の桁を得るために%10を利用する。
				j /= 10;
				//再右端の桁を取り除くためにn/=10を利用する。
			}
			//a<sum_digit<bならばsumに追加
			if (a <= sum_digit && sum_digit <= b) {
//				System.out.println(i+"を足します");
				sum += i;
//				System.out.println(sum+"になりました");
			}
			sum_digit=0;
		}
		System.out.println(sum);
	}

}
