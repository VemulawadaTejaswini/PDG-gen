import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int[] array = new int[N];
			int[] cntArray = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextInt();
			}

			int max = 0;
			int tmp = 0;
			for (int i = 0; i < N - 1; i++) {
				if (array[i] >= array[i + 1]) {
					tmp++;
					if (max < tmp) {
						max = tmp;
					}
				} else {
					tmp = 0;
				}
			}
			System.out.println(max);
		}
	}
}
