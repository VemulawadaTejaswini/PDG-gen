import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for (int i = 0; i < N; i++) {
			double d = sc.nextDouble();
			p[i] = (d+1)/2;
		}
		double max = 0.0;
		double[] amounts = new double[N-K+1];
		for (int i = 0; i < K; i++) {
			max += p[i];
		}
		amounts[0] = max;
		for (int i = 0; i < N-K; i++) {
			amounts[i+1] = amounts[i] + p[i+K] - p[i];
			if (max < amounts[i+1]) {
				max = amounts[i+1];
			}		
		}
		System.out.println(max);
		
	}
}