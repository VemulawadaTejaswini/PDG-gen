import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double a[] = new double[N];
		double sum = 0;
		double avg;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		avg = sum / N;
		double d_min = 1000;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (Math.abs(a[i] - avg) < d_min) {
				ans = i;
				d_min = Math.abs(a[i] - avg);
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
