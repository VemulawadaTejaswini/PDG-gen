import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long N = sc.nextLong();
			long K = sc.nextLong();

			long amari = N % K;
			double kijun = K / 2;
			long ans;
			if (amari > kijun) {
				ans = K - amari;
			} else {
				ans = amari;
			}
			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}
