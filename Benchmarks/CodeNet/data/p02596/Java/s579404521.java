package question;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//1 ≦ K ≦ 10^6 の整数を入力
		Scanner sc = new Scanner(System.in);
		System.out.println("1 <= K <= 10^6 の整数を入力してください。");
		// 入力値の取得
		int k = sc.nextInt();
		sc.close();
		//数列の値は全て奇数なので、2 の倍数が登場することはありません。
		if (k % 2 == 0) {
			//入力された数字は偶数の場合、-1を出力
			System.out.println("-1");
			return;
		}
		
		//好きな数字である７を初期化
		int num = 7;
		//何項目を初期化
		int count = 0;

		for(int i=1; i<=k; i++) {
			//ｋの倍数かどうかを判断
			if(num % k == 0) {
				count = i;
				break;
			} 
			//乗余はｋの倍数かどうかを判断
			num = (num * 10 + 7) % k;
		}
		//何項目を出力
		System.out.println(count);
	}
}
