import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int[] kosuu = new int[100000 + 1];

			int sum = 0;
			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				sum += value;
				kosuu[value]++;
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int b = sc.nextInt();
				int c = sc.nextInt();

				sum += (c - b) * kosuu[b];
				System.out.println(sum);

				kosuu[c] += kosuu[b];
				kosuu[b] = 0;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
