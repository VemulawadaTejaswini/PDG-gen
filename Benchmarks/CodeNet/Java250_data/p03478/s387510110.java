import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int numberN = sc.nextInt();
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		//AとBの和変数
		int sumNumAB = 0;
		//10の位と1の位和変数
		int sumTenOne = 0;
		//処理文
		//1<= ● <= N　繰り返し　1からNまで
		for (int i = 1; i <= numberN; i++) {
			//●　選別する　10の位と1の位の値
			//合計する　合計してAとBの範囲であるもの
			//合計していく sumNumAB
			sumTenOne = digitNumberSummation(i);
			if ((numberA <= sumTenOne && sumTenOne <= numberB)) {
				sumNumAB += i;
			}
		}
		//標準出力　合計したsumNumAB
		System.out.print(sumNumAB);
	}
	//各桁を計算し、和を返す
	public static int digitNumberSummation(int i){

		int num = i;
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}