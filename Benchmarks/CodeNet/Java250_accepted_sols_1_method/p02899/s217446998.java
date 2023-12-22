import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] A = new String[N];
		int tmp = 0;
		int answer = 0;

		for (int i = 1; i <= N; i++) {
			tmp = sc.nextInt();
			A[tmp - 1] = String.valueOf(i);
		}

		System.out.println(String.join(" ", A));
	}
}
