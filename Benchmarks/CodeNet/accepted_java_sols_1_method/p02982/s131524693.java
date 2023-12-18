import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X = new int[N][D];
		int ans = 0;
		for(int i = 0; i < N; i++) 
			for(int j = 0; j < D; j++)
				X[i][j] = sc.nextInt();
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				int d = 0;
				for(int k = 0; k < D; k++) {
					d += Math.pow(X[j][k]-X[i][k], 2);
				}
				if(Math.sqrt(d) - (int)Math.sqrt(d) == 0)
					ans++;
			}
		}
		System.out.println(ans);

	}

}
