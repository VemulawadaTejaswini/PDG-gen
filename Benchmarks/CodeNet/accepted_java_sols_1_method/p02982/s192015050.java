import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), D = sc.nextInt();
		double[][] point = new double[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				point[i][j] = sc.nextDouble();
			}
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				// dist (i, j)
				double dist = 0;
				for(int k = 0; k < D; k++) dist += (point[i][k] - point[j][k]) * (point[i][k] - point[j][k]);
				int dist_i = (int)Math.sqrt(dist);
				if((int)dist == dist_i * dist_i) cnt++;
			}
		}
		System.out.println(cnt);
	}
}
