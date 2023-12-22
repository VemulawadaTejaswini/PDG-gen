import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// M-SOL_2020_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
		int ans = 8;
		if(600 <= X) {
			ans = 7;
		}
		if(800 <= X) {
			ans = 6;
		}
		if(1000 <= X) {
			ans = 5;
		}
		if(1200 <= X) {
			ans = 4;
		}
		if(1400 <= X) {
			ans = 3;
		}
		if(1600 <= X) {
			ans = 2;
		}
		if(1800 <= X) {
			ans = 1;
		}

		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
