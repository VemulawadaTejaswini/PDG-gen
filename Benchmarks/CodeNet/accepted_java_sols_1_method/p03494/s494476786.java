import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		
		int c[] = new int[N];
		int minc = 0;
		for (int i = 0; i < N; i++) {
			int t = A[i];
			int ct = 0;
			while ((t & 0x01) != 1) {
				ct++;
				t = t >> 1;
				if (i != 0 && ct >= minc) break;
			}
			if (i == 0) {
				minc = ct;
			} else if (ct < minc) {
				minc = ct;
			}
			c[i] = ct;
		}
		
		System.out.println(minc);

	}

}
