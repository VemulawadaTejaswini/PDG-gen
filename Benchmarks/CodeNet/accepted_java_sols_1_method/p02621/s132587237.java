import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 172_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = a * a;
		int c = b * a;
		// 出力
		System.out.println(a+b+c);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
