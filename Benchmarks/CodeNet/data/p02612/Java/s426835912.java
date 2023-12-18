import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 173_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();

		a = -a;

		for(; a<0; ) {
			a += 1000;
		}

		// 出力
		System.out.println(a);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
