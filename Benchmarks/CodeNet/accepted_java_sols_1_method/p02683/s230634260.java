import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int x = Integer.parseInt(scan.next());
		int[][] ca = new int[n][m+1];
		for (int i = 0;i < n; ++i){
			for (int k = 0;k < m+1; ++k){
				ca[i][k] = Integer.parseInt(scan.next());
			}
		}

		int[] understand = new int[m];
		int ans = -1;
		int money = 0;
		for(int i = 0;i < 1<<n; ++i){
			Arrays.fill(understand, 0);
			money = 0;
			for(int k = 0;k < n; ++k){
				if ((1&i>>k) == 1){
					money += ca[k][0];
					for(int j = 0;j < m; ++j){
						understand[j] += ca[k][j+1];
					}
				}
			}

			//check
			boolean ok = true;
			for(int k = 0;k < m; ++k){
				if (understand[k] < x ){
					ok = false;
					break;
				}
			}
			if(ok){
				if (ans == -1){
					ans = money;
				}else{
					ans = Math.min(ans, money);
				}
			}
		}

		System.out.print(ans);

	}

}


//end