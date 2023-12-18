import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt() * 2;
			if(n == 0){
				break;
			}
			int [][] dp = new int[n][2];
			int [] jumpA = {1,3,5};
			int [] jumpB = {-1,1,3};
			for(int i=0; i < n; i+= 2){
				dp[i][0] = -1;
				dp[i][1] = sc.nextInt();
			}
			for(int i=1; i < n; i+= 2){
				dp[i][0] = -1;
				dp[i][1] = sc.nextInt();
			}

			for(int i=0; i <= 1; i++){
				int j = i;
				if(dp[i][1] == 1){
					while(j < n && dp[j][1] == 1)
						j += 2;
					j -= 2;
				}
				dp[j][0] = 0;
			}

			//dp start
			for(int i=0; i < n; i++){
				if(dp[i][0] == -1)
					continue;
				for(int j=0; j <= 2; j++){
					int value = dp[i][0] + 1;
					int k;

					if(i%2 == 0)
						k = i + jumpA[j];
					else
						k = i + jumpB[j];

					if(k >= n)
						continue;

					if(dp[k][1] == 1){
						while(k < n && dp[k][1] == 1)
							k += 2;
						k -= 2;
					}
					else if(dp[k][1] == 2){
						while(dp[k][1] == 2)
							k -= 2;
					}

					if(dp[k][0] == -1 || value < dp[k][0])
						dp[k][0] = value;
				}
			}

			//print
			if(dp[n-1][0] == -1 && dp[n-2][0] == -1)
				System.out.println("NA");
			else if(dp[n-1][0] == -1 || dp[n-2][0] == -1){
				if(dp[n-1][0] == -1)
					System.out.println(dp[n-2][0]);
				else
					System.out.println(dp[n-1][0]);
			}
			else{
				int result = Math.min(dp[n-1][0], dp[n-2][0]);
				System.out.println(result);
			}

		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}