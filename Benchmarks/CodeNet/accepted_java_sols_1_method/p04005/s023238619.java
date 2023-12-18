import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long[] abc = new long[3];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = sc.nextInt();

			if (abc[i] % 2 == 0) {
				System.out.println("0");
				return;
			}
		}

		Arrays.sort(abc);

		long ans = abc[0] * abc[1];
		System.out.println(ans);

		sc.close();
	}

}
