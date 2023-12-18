import java.util.Scanner;

public class AOJ0568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),K = sc.nextInt(); 
		long[][] NK = new long[N][6]; 
		int[] dp = new int[N]; 
		for(int i = 0; i < N; i++) dp[i] = 0;
		for(int i = 0; i < K; i++){
			int scan = sc.nextInt();
			dp[scan-1] = sc.nextInt();
		} 
		for(int i = 0; i < N; i++){
			if(dp[i] == 1){
				if(i == 0)NK[i][1] = 1;
				else{
					NK[i][0] += NK[i-1][1];
					NK[i][1] += NK[i-1][2] + NK[i-1][3] + NK[i-1][4] + NK[i-1][5];
				}
			}
			else if(dp[i] == 2){
				if(i == 0)NK[i][3] = 1;
				else{
					NK[i][2] += NK[i-1][3];
					NK[i][3] += NK[i-1][0] + NK[i-1][1] + NK[i-1][4] + NK[i-1][5];
				}
			}
			else if(dp[i] == 3){
				if(i == 0)NK[i][5] = 1;
				else{
					NK[i][4] += NK[i-1][5];
					NK[i][5] += NK[i-1][0] + NK[i-1][1] + NK[i-1][2] + NK[i-1][3];
				}
			}
			else{
				if(i == 0){
					NK[i][1] = 1;NK[i][3] = 1;NK[i][5] = 1;
				}
				else{
					if(NK[i-1][1] > 0){
						NK[i][0] += NK[i-1][1] % 10000;
						NK[i][3] += NK[i-1][0] + NK[i-1][1] % 10000;
						NK[i][5] += NK[i-1][0] + NK[i-1][1] % 10000;
					}else{
						NK[i][3] += NK[i-1][0] + NK[i-1][1] % 10000;
						NK[i][5] += NK[i-1][0] + NK[i-1][1] % 10000;
					}
					if(NK[i-1][3] > 0){
						NK[i][1] += NK[i-1][2] + NK[i-1][3] % 10000;
						NK[i][2] += NK[i-1][3] % 10000;
						NK[i][5] += NK[i-1][2] + NK[i-1][3] % 10000;
					}else{
						NK[i][1] += NK[i-1][2] + NK[i-1][3] % 10000;
						NK[i][5] += NK[i-1][2] + NK[i-1][3] % 10000;
					}
					if(NK[i-1][5] > 0){
						NK[i][1] += NK[i-1][4] + NK[i-1][5] % 10000;
						NK[i][3] += NK[i-1][4] + NK[i-1][5] % 10000;
						NK[i][4] += NK[i-1][5] % 10000;
					}else{
						NK[i][1] += NK[i-1][4] + NK[i-1][5] % 10000;
						NK[i][3] += NK[i-1][4] + NK[i-1][5] % 10000;
					}
				}
			}
		}
		int total = 0;
		for(int j = 0; j < 6; j++){
			total += NK[N-1][j]; 
		}
		System.out.println(total % 10000);
	}

}