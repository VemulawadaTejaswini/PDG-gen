import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		long sum = 0;
		long temp = A[0];
		
		for (int i = 1; i < N; i++) {
			if (A[i] < temp) {
				sum += temp - A[i];
			}
			else {
				temp = A[i];
			}
		}
		// 結果の出力
		System.out.println(sum);
		
		sc.close();
	}
}
