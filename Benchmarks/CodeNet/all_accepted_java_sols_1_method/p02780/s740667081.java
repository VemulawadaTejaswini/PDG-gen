import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		double[] P = new double[N+1];
		P[0] = 0;
		for(int i = 0;i < N;i++) {
			double p = scn.nextInt();
			P[i+1] = P[i] + (p+1)*0.5;
		}
		double ans = -1;
		for(int i = 0;i < N-K+1;i++) {
			ans = Math.max(P[i+K]-P[i], ans);
		}
		System.out.println(ans);
	}

}