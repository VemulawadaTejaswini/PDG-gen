
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = in.nextInt();
			}
			int[] w = new int[m];
			for (int i = 0; i < m; i++) {
				w[i] = in.nextInt();
			}
			int counter = 0;
			int sqW, sqH;
			for (int xposi = 0; xposi < m; xposi++) {
				sqW = 0;
				for (int addx = xposi; addx < m; addx++) {
					sqW += w[addx];
					for (int yposi = 0; yposi < n; yposi++) {
						sqH = 0;
						for (int addy = yposi; addy < n; addy++) {
							sqH += h[addy];
							if (sqW == sqH) {
								counter++;
							}
							if (sqW <= sqH) {
								break;
							}
						}
					}
				}
			}
			System.out.println(counter);
		}

	}

}