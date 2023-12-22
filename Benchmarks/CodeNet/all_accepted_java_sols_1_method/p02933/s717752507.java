import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		// 出力
		if(a >= 3200) {
			System.out.println(s);
		} else {
			System.out.println("red");

		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
