import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), K = sc.nextInt();
		sc.close();
		int max = Math.max(A, Math.max(B, C));
		int max2=max;

		for (int i = 0; i < K; i++) {
			max=max*2;
		}
		System.out.println(max-max2 + A + B + C);
	}
}
