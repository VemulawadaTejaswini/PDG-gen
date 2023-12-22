import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] array = line2.split(" ");

		long[] ai = new long[array.length];
		for (int i = 0; i < ai.length; i++) {
			ai[i] = Integer.parseInt(array[i]);
		}

		Arrays.sort(ai);
		long A = ai[0];
		long B = ai[n - 1];

		long C = 0;
		for (int i = 0; i < ai.length; i++) {
			C += ai[i];

		}

		System.out.println(A + " " + B + " " + C);

	}

}