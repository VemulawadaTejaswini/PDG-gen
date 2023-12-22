import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A, sum = 0;
		for (int i = 0; i < N; ++i) {
			A = sc.nextInt();
			if (A % 2 == 1) ++sum;
		}
		sc.close();
		if (sum % 2 == 1) System.out.print("NO");
		else System.out.print("YES");
	}
}