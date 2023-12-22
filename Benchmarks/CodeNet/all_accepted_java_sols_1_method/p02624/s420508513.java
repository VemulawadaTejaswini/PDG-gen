import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 172_D
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// Scannerクラスのインスタンスをクローズ
		sc.close();

		long ans = 0;

		for(int i=1; i<=N; i++){
			long kakeMax = N/i;

			ans += kakeMax*(kakeMax+1)*i / 2;
		}

		System.out.println(ans);
	}
}