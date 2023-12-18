import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double T = sc.nextInt();
		double A = sc.nextInt();
		double []H = new double[N];
		for(int i = 0; i < N; i++) H[i] = sc.nextInt();
		sc.close();
		int id = 0;
		double min = Math.abs(T - H[0] * 0.006 - A);
		for(int i = 1; i < N; i++) {
			double t = Math.abs(T - H[i] * 0.006 - A);
			if(t < min) {
				min = t;
				id = i;
			}
		}
		System.out.println(id + 1);
	}
}