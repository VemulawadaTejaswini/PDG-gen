import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), i;
		sc.close();
		if (N == 1) System.out.print(M);
		else if (M == 1) System.out.print(1);
		else {
			for (i = 2; i <= M / 2; ++i) {
				if (M % i == 0 && N <= i) break;
			}
			if (i == M / 2 + 1) System.out.print(1);
			else System.out.print(M / i);
		}
	}
}