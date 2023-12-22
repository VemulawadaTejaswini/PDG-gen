import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			Arrays.sort(a);
			int max = a[n - 1];
			int[] b = new int[n - 1];
			IntStream.range(0, n - 1).forEach(i -> b[i] = Math.min(a[i], max - a[i]));
			Arrays.sort(b);
			int next = b[n - 2];
			if (Arrays.binarySearch(a, next) >= 0) {
				System.out.println(max + " " + next);
			} else {
				System.out.println(max + " " + (max - next));
			}
		}
	}
}
