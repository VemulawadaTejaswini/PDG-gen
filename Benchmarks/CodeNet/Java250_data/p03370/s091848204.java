import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] m = new int[200];
		int N = sc.nextInt();
		int X  = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < N; i++)
			m[i] = sc.nextInt();

		for (int i = 0; i < N; i++)
			X -= m[i];
		for (int i = 0; i < N; i++)
			if (m[i] < min)
				min = m[i];
		sum = N + (X / min);
		System.out.println(sum);
	}
}