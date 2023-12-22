import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n > 0) {
			int max = 0;
			int min = Integer.MAX_VALUE;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int v = scanner.nextInt();
				sum += v;
				if (max < v) max = v;
				if (min > v) min = v;
			}
			sum -= (max + min);
			int av = sum / (n-2);
			System.out.println(av);
			n = scanner.nextInt();
		}
	}
}

