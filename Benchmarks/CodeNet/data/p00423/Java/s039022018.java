import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			int a = 0, b = 0;
			for (int i = 0; i < n; i++) {
				int pa = in.nextInt();
				int pb = in.nextInt();
				a += pa;
				b += pb;
				if (pa > pb) {
					a += pb;
					b -= pb;
				} else if (pa < pb) {
					a -= pa;
					b += pa;
				}
			}
			System.out.println(a + " " + b);
		}
	}
}