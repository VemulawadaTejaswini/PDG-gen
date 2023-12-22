import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		// 各配列の0番目の要素に0を格納
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		for(int i = 1; i <= N; i++) {
			t[i] = sc.nextInt(); // int t[i]を受け取る
			x[i] = sc.nextInt(); // int x[i]を受け取る
			y[i] = sc.nextInt(); // int y[i]を受け取る
		}
		sc.close(); // 標準入力を終了

		boolean can = true; // 可能フラグ

		for(int i = 0; i < N; i++) {
			int dt = t[i+1] - t[i]; // t[i+1]とt[i]の間の時間差
			int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);

			// dt < dist なら　canフラグをfalseにする
			if(dt < dist) can = false;

			// dt%2 != dist%2 なら　canフラグをfalseにする
			if(dt%2 != dist%2) can = false;
		}

		if (can) {
			// 可能
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}