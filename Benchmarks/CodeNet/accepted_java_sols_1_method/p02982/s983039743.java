import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int[][] B = new int[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				double sum = 0;
				for(int k = 0; k < D; k++) {
					double tmp = Math.abs((double)(B[i][k] - B[j][k]));
					sum += Math.pow(tmp, 2);
				}
				double num = Math.sqrt(sum);
				if(num - (int)num == 0) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		scan.close();
	}

}