import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		while ((n = sc.nextInt()) != 0 && (m = sc.nextInt()) != 0) {
			boolean[] flag = new boolean[n];
			int ptr = 0;
			int ptrbu = 0;
			int mCount = 0;
			int trueCount = 0;
			while (trueCount < n) {
				if (ptr < n) {
					if (!flag[ptr]) {
						mCount++;
						if (mCount == m) {
							flag[ptr] = true;
							trueCount++;
							ptrbu = ptr;
							mCount = 0;
						}
						ptr++;
					} else {
						ptr++;
					}
				} else {
					ptr = 0;
				}
			}
			System.out.println(ptrbu + 1);
		}
	}
}