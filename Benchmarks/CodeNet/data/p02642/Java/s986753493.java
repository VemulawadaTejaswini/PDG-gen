import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			String[] data2Array = data2.split(" ");
			int[] a = Stream.of(data2Array).mapToInt(Integer::parseInt).toArray();

			int[] array = new int[10000005];
			for (int x : a) {
				if (array[x] != 0) {
					array[x] = 2;
					continue;
				}
				for (int i = x; i < 10000005; i += x) {
					array[i]++;
				}
			}

			int ans = 0;
			for (int x : a) {
				if (array[x] == 1) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}