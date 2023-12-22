import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] nArray = new int[n];

		for (int i = 0; i < n; i++) {

			nArray[i] = scan.nextInt();
		}

		Arrays.sort(nArray);

		int answer = 0;

		for (int i = 0; i < k; i++) {

			answer += nArray[i];
		}

		println(answer);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
