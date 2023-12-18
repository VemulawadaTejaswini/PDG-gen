import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int[] A = new int[50];
		int[] B = new int[50];
		int[] C = new int[50];
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			for (int i = 0; i < n; ++i) {
				C[i] = n - i - 1;
			}
			for (int i = 0; i < r; ++i) {
				int c = sc.nextInt();
				for (int j = 0; j < (n + 1) / 2; ++j) {
					A[j] = C[j];
				}
				for (int j = 0; j < n / 2; ++j) {
					B[j] = C[(n + 1) / 2 + j];
				}
				int ap = (n + 1) / 2;
				int bp = n / 2;
				int cp = n;
				while (ap > 0 || bp > 0) {
					for (int j = 0; j < c && ap > 0; ++j) {
						C[--cp] = A[--ap];
					}
					for (int j = 0; j < c && bp > 0; ++j) {
						C[--cp] = B[--bp];
					}
				}
			}
			System.out.println(C[0]);
		}
	}

}