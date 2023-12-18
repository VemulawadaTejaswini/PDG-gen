import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int[] mgp = new int[101];
		while (n != 0 || s != 0) {
			Arrays.fill(mgp, 0);
			int asize = 0;
			for (int i = 0; i < n; i++) {
				int pw = in.nextInt();
				mgp[pw]++;
				if (pw >= s) {
					asize++;
				}
			}
			long pear = 0;
			for (int i = 1; i <= 100; i++) {
				for (int j = i; j <= 100; j++) {
					if (i + j > s && mgp[i] != 0 && mgp[j] != 0) {
						int p = mgp[i] * mgp[j];
						if (i == j) {
							p -= mgp[i];
							p /= 2;
						}
						pear += p;
					}
				}
			}
			System.out.println(pear);
			n = in.nextInt();
			s = in.nextInt();
		}
	}
}