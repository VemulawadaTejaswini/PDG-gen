import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		//配列hogeの要素合計の変数
		long sum = 0;

		//入力
		int n  = src.nextInt();

		//配列hoge
		ArrayList<Integer> hoge = new ArrayList<Integer>();

		//nに入力された数だけ繰り返し、配列に数値を代入
		for(int i = 0; i < n; i++) {
			int x  = src.nextInt();
			hoge.add(x);
			sum += x;
		}

		//最小値と最大値の変数を宣言
		int min, max = 0;
		max	=	hoge.get(0);
		min = max;
	
		//最小値と最大値を算出
		for(int i = 0; i < n; i++)
            min = Math.min(min,hoge.get(i));

		for(int i = 0; i < n; i++)
            max = Math.max(max,hoge.get(i));


		//出力
		System.out.println(String.format("%d %d %d",min, max, sum));

	}
}
