import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		int a = 0;
		double b = 0;

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			a += X[i];
		}
		double aa=a;
		double NN=N;
		sc.close();
		double A = Math.round(aa / NN);

		for (int i = 0; i < N; i++) {
			b += Math.pow((X[i] - A), 2);
		}
		int c = (int) b;
		System.out.println(c);
	}
}
