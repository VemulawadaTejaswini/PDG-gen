import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X;
		N = sc.nextInt();
		X = sc.nextInt();
		int L[] = new int[N + 1];

		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();

		int a = 0;
		int b = 0;
		for (int i = 0; i < N + 1; i++) {
			if (a <= X) {
				a += L[i];
				b++;
			}

		}
		System.out.println(b);
	}

}
