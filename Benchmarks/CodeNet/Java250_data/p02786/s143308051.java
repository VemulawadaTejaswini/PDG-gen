import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		// Hのlog2をとる
		double val = Math.log(H) / Math.log(2);
		val = Math.floor(val);

		long cnt = 0;

		for (int i = 0; i <= val; i++) {
			cnt += Math.pow(2, i);
		}

		System.out.println(cnt);
		sc.close();
	}
}
