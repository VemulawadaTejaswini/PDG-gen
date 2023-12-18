import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		long sum = 0;
		if (num > 0 && num <= 10000) {
			long array[] = new long[num];
			for (int i = 0; i < num; i++) {
				array[i] = scanner.nextLong();
				if (array[i] >= -1000000 && array[i] <= 1000000) {
					sum += array[i];
				}
			}
			Arrays.sort(array);
			System.out.println(array[0] + " " + array[num - 1] + " " + sum);
		}
	}
}