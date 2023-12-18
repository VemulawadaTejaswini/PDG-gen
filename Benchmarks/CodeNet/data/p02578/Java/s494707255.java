import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る

		long sum = 0; // 踏み台の高さの合計
		long mhigh = 0; // A[i]より前での、身長の最高値

		for(int i = 0; i < N; i++) {
			long A = sc.nextLong(); // long Aを受け取る
			if(A > mhigh) {
				mhigh = A; // 身長の最高値更新
			} else if(A < mhigh) sum += mhigh - A; // 踏み台の高さ加算
		}

		System.out.println(sum);
	}

}