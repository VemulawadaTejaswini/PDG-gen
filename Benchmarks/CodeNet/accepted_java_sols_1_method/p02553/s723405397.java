import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long max = a*c;
		if(max < a*d) {
			max = a*d;
		}
		if(max < b*c) {
			max = b*c;
		}
		if(max < b*d) {
			max = b*d;
		}

		System.out.println(max);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
