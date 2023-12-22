import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 110000;
		int[] data = new int[number + 1];
		int[] result = new int[number + 1];

		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		sc.close();

		//手順1
		int m = 2;
		//手順2
		int n = 0;
		//手順3
		Arrays.fill(data, 1);
		//手順4
		Arrays.fill(result, 0);
		//手順5 0と1は最初から除外する
		data[0] = data[1] = 0;

		do {
			//素数の倍数をリストから削除する
			for(int i = 2 * m; i < number + 1; i += m) {
				data[i] = 0;
			}
			//結果を格納
			result[n] = m;
			n++;
			//次の素数候補を見つける
			do {
				m++;
			}while(data[m] == 0 && m < number);
		}while(m < number);

		//結果を出力
		for(int i = 0; i < result.length; i++) {
			if(result[i] >= X) {
				System.out.println(result[i]);
				break;
			}
		}
	}
}