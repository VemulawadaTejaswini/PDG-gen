import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double T = sc.nextDouble();
		int A = sc.nextInt();
		double[] H = new double[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		double tmp = 2000000000;
		double ans = 2000000000;
		int res = 0;
		for(int i = 0; i < N; i++) {
			tmp = T - H[i] * 0.006;
			if(Math.abs(tmp - A) < ans) {
				ans = Math.abs(tmp - A);
				res = i;
			}
		}
		System.out.println(res + 1);
	}

}
