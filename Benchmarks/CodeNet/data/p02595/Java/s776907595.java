import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int D = sc.nextInt(); // int Dを受け取る

		int ans = 0; // 原点との距離がD以下の点の個数

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt(); // int Xを受け取る
			int Y = sc.nextInt(); // int Yを受け取る
			long X2 = X * X;
			long Y2 = Y * Y;
			if(D >= Math.sqrt(X2 + Y2)) {
				ans += 1;
			}
		}
		sc.close(); // 標準入力を終了

		System.out.println(ans);
	}
}