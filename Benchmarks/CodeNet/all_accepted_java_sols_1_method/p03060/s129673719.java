import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] v = new int[N];
		int[] c = new int[N];
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
			num[i] = v[i] - c[i];
		}
		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			num[i] = v[i] - c[i];
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (num[i] > 0) {
				sum += num[i];
			}
		}

		System.out.println(sum);
	}
}
