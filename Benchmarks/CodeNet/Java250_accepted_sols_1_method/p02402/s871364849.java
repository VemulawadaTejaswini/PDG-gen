import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		//n:入力値の個数, ai:入力値, min:最小値 , max:最大値,
		int n,ai,min,max,i;
		//sum:合計値, aiを合算する為、int型では無くlong型で範囲を拡大する
		long sum = 0;

		//キーボード入力
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		//nの値を受け取る（この後入力される値の個数を把握する）
		n = Integer.parseInt(br.readLine());

		//int型の最大値をminに代入
		min = Integer.MAX_VALUE;
		//int型の最小値をmaxに代入
		max = Integer.MIN_VALUE;

		//strAryにキーボード入力された文字列を” ”で区切った状態で代入
		String[] strAry = br.readLine().split(" ");

		//iが0のときi+してiがnより小さい間、{}処理を繰り返す
		for (i = 0; i < n; i++){
			//aiに文字列を代入
			ai = Integer.parseInt(strAry[i]);
			//条件：aiがminより小さい場合、minにaiを代入する
			if(ai < min) min = ai;
			//条件：aiがmaxより大きい場合、maxにaiを代入する
			if(ai > max) max = ai;
			//sumにsum+aiを代入する
			sum += ai;
		}
		//最小値、最大値、合計を1行で出力
		System.out.println(min+" "+max+" "+sum);
	}
}