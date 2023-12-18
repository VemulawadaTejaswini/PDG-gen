import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		// 出力
		if(X >= 30) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
