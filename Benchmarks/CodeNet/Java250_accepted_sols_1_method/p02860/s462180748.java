import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N, Sの入力
		int N = sc.nextInt();
		String S = sc.next();
		
		String result = "No";
		
		// Nが偶数の時だけ考える
		if (N % 2 == 0) {
			String front = S.substring(0, N / 2);
			String rear = S.substring(N / 2, N);
			if (front.equals(rear)) {
				result = "Yes";
			}
		}
		// 結果の出力
		System.out.println(result);
		
		sc.close();
	}
}
