import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] p = new int[2];
		for (int i = 0; i < 2; i++) {
			int a1, a2, a3;
			p[i] += a1 = in.nextInt();
			p[i] += a2 = in.nextInt();
			p[i] += a3 = in.nextInt();
			for (int j = 4; j <= 10; j++) {
				int aj = in.nextInt();
				if (aj > a1) {
					p[i] += (aj - a1);
					int c = a1;
					a1 = aj;
					aj = c;
				}
				if (aj > a2) {
					p[i] += (aj - a2);
					int c = a2;
					a2 = aj;
					aj = c;
				}
				if (aj > a3) {
					p[i] += (aj - a3);
					int c = a3;
					a3 = aj;
					aj = c;
				}
			}
		}
		System.out.println(new StringBuilder().append(p[0]).append(' ')
				.append(p[1]));
	}
}