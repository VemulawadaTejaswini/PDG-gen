import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Long D = sc.nextLong();

		Long X = (long) 0;
		Long Y = (long) 0;

		int ans = 0;

		for(int i=0; i<N; i++) {
			X = sc.nextLong();
			Y = sc.nextLong();

			if(Math.sqrt((X * X) + (Y * Y)) <= D) {
				ans++;
			}
		}

		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
