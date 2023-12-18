import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int N = Integer.parseInt(data);

			long[] array = getArray(105);
			for (int i = 1; i <= N; i++) {
				System.out.println(array[i]);
			}
		}
	}

	private static long[] getArray(int n) {
		long[] array =  new long[10050];
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= n; y++) {
				for (int z = 1; z <= n; z++) {
					long ans = calc(x, y, z);
					if (ans < n) {
						array[(int)ans] += 1;
					}
				}
			}
		}
		return array;
	}

	private static long calc(int x, int y, int z) {
		return (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x);
	}
}