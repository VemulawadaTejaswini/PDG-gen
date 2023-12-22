import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D = stdIn.nextInt();
		int X[][] = new int[N][D];
		int ans = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < D; j++){
				X[i][j] = stdIn.nextInt();
			}
		}

		for(int i = 0; i < N; i++){
			for(int j = i + 1; j < N; j++){
				double tmp = 0;
				for(int k = 0; k < D; k++){
					tmp += Math.pow(X[j][k] - X[i][k],2);
				}
				double sq = Math.sqrt(tmp);
				if((sq - (int)sq) == 0){
					ans++;
				}
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}