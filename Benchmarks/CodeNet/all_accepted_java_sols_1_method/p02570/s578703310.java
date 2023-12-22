import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;

		if(S*T >= D) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
