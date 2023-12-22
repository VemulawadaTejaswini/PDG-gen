import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		//たこ焼き数
		int N = scan.nextInt();

		//たこ焼き美味しさ　di入力
		int[] d = new int[N];
		for (int i=0; i<N;i++) {
			d[i] = scan.nextInt();
		}

		//総和 初期化
		int total = 0;

		//総和 算出
		for(int i=0; i<N-1; i++) {
			for(int j= i+1; j<N; j++) {
				total = total + d[i] * d[j];
			}
		}

		System.out.println(total );

	}

}
