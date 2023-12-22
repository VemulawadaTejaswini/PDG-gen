import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int ans = 0;
		// 出力
		if(a == 1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
