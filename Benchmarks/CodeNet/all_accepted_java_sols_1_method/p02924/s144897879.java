import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long ans = (N-1)*N/2;

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
