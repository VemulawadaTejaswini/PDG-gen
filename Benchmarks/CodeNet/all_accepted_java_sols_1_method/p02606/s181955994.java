import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AISing_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		int res = 0;

		for(int i = L; i <= R; i++) {
			if(i%d == 0) {
				res++;
			}
		}
		// 出力
		System.out.println(res);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
