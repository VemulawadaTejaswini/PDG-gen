import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//入力の読み込み
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //整数Nの値
		int base = sc.nextInt();  //進数Kの値

//		//パターン1
//		int i = 0;  //基数を何乗するかを表す数
//
//		//基数の値^iごとに桁が増える
//		while(Math.pow(base, i) <= n) {
//			i++;
//		}
//		System.out.print(i);

		//パターン2
		int count = 0;  //基数で割った回数＝桁数
		while(n > 0) {  //Nが0になるまで繰り返す
			n = n/base;
			count++;
		}
		System.out.print(count);
	}
}