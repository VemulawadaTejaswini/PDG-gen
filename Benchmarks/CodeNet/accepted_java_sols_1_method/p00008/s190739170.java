import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int c = 0;
			for (int i = 0; i < 10000; i++) {
				int s = i % 10 + (i / 10) % 10 + (i / 100) % 10 + (i / 1000) % 10;
				if (s == n)
					c += 1;
			}
			System.out.println(c);
		}
	}
}