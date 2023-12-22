import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		double[][] point = new double[N][D];
		double[][] y = new double[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				point[i][j] = sc.nextDouble();
			}
		}
		int count = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				double dist = 0;
				for(int k = 0; k < D; k++) {
					dist += Math.pow((point[i][k] - point[j][k]), 2);
				}
				dist = Math.sqrt(dist);
				if(dist == Math.floor(dist))count++;
			}
		}
		System.out.println(count);
	}
}