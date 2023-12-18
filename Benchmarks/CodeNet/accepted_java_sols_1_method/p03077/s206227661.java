import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[] array = new long[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);

		long sum = 0;
		if (n % array[0] == 0) {
			sum = 4 + n / array[0];

		} else {
			sum = 5 + n / array[0];
		}

		System.out.println(sum);
	}
}
