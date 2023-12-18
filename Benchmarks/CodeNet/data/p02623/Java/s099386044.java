import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();
			String data3 = scanner.nextLine();

			long[] arr1 = Stream.of(data1.split(" ")).mapToLong(Long::parseLong).toArray();
			int[] arr2 = Stream.of(data2.split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] arr3 = Stream.of(data3.split(" ")).mapToInt(Integer::parseInt).toArray();

			Queue<String> q1 = new ArrayDeque<String>(Arrays.asList(data1.split(" ")));
			Queue<String> q2 = new ArrayDeque<String>(Arrays.asList(data2.split(" ")));
			Queue<String> q3 = new ArrayDeque<String>(Arrays.asList(data3.split(" ")));

			long n = arr1[0];
			long m = arr1[1];
			long k = arr1[2];

			long a = Long.parseLong(q2.poll());
			long b = Long.parseLong(q3.poll());
			int readCount = 0;
			long limit = k;
			for (int i = 0; i < 400000; i++) {

				if ((a != Integer.MAX_VALUE && a > limit) && (b != Integer.MAX_VALUE && b > limit)) {
					break;
				}

				if (a != Integer.MAX_VALUE && a <= b) {
					limit -= a;
					readCount++;

					if (q2.isEmpty()) {
						a = Integer.MAX_VALUE;
					} else {
						a = Long.parseLong(q2.poll());
					}
				} else if (b != Integer.MAX_VALUE && b < a) {
					limit -= b;
					readCount++;
					if (q3.isEmpty()) {
						b = Integer.MAX_VALUE;
					} else {
						b = Long.parseLong(q3.poll());
					}
				} else if (a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
					break;
				} else {
					continue;
				}
			}

			System.out.println(readCount);
		}
	}
}