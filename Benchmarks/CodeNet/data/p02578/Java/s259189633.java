import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			int N = Integer.parseInt(data1);

			String[] data2Array = data2.split(" ");
			int[] arr = Stream.of(data2Array).mapToInt(Integer::parseInt).toArray();

			int prevHeight = 0;
			int ans = 0;
			for (int A : arr) {
				if (prevHeight == 0) {
					prevHeight = A;
					continue;
				}

				if (prevHeight > A) {
					ans += prevHeight - A;
					prevHeight = Math.max(prevHeight, A);
				} else {
					prevHeight = Math.max(prevHeight, A);
					continue;
				}
			}

			System.out.println(ans);
		}
	}
}