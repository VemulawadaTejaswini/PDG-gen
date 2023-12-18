import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (0 == r && n == 0)
				break;
			int[] yama = new int[n];
			for (int i = 0; i < yama.length; i++) {
				yama[i] = i + 1;
			}
			while (r-- != 0) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int i = yama.length - p + 1; i < yama.length; i++) {
					for (int j = i; j > i - c; j--) {
						int w = yama[j];
						yama[j] = yama[j - 1];
						yama[j - 1] = w;
						// System.out.println(Arrays.toString(yama));
					}

				}
			}
			System.out.println(yama[n - 1]);
		}

		sc.close();

	}

}