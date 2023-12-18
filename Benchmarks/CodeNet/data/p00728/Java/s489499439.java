import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0, min = 1000, max = 0;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				c += p;
				if (p > max)
					max = p;
				if (p < min)
					min = p;
			}
			c = c - max - min;
			System.out.println(c / (n - 2));
		}
	}
}