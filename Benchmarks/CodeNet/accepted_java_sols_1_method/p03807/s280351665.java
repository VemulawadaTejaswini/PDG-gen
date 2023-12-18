import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int kisuu = 0;
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				if (A[i] % 2 == 1) {
					kisuu++;
				}
			}
			if (kisuu % 2 == 1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
