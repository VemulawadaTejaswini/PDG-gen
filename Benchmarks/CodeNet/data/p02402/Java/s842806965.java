import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int times = sc.nextInt();
		int[] ary = new int[times];
		for(int i=0; i<times; i++) {
			ary[i] = sc.nextInt();
		}

		//処理
		int max = ary[0];
		int min = ary[0];
		int sum = 0;

		for(int i=0; i<times; i++) {
			int v =ary[i];
			if(max > v) {
				max = v;
			}else if(min < v) {
				min = v;
			}
			sum = sum + v;
		}

		//出力
		System.out.println(max +" "+ min +" "+ sum);

	}

}

