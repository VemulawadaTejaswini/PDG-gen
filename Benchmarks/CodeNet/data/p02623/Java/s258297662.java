import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();
			String data3 = scanner.nextLine();

			int[] arr1 = Stream.of(data1.split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] a = Stream.of(data2.split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] b = Stream.of(data3.split(" ")).mapToInt(Integer::parseInt).toArray();

			int n = arr1[0];
			int m = arr1[1];
			int k = arr1[2];

			long t = 0;

			for (int i = 0; i < b.length; i++) {
				t += b[i];
			}

			int j = m;
			int ans = 0;
			for (int i = 0; i < n + 1; i++) {
				while(j > 0 && t > k) {
					--j;
					t -= b[j];
				}
				if (t > k) break;
				ans = Math.max(ans, i+j);
				if (i == n) break;
				t += a[i];
			}


			System.out.println(ans);
		}
	}
}
