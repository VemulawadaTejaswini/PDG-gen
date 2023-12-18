import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
      	int x = scn.nextInt();
		int[] c = new int[n];
      	int[][] a = new int[n][m];
		for(int i=0; i<n; i++){
			c[i] = scn.nextInt();
          	for(int j=0; j<m; j++){
              a[i][j]=scn.nextInt();
            }
		}
      	ArrayList<Integer> money = new ArrayList<>();
		for(int i=0; i<1<<n; i++) {
			int[] sum = new int[m];
			int check  = 0;
			int cost = 0;
			for(int j=0; j<n; j++) {
				if((1 & i >> j) == 1) {
					for(int k = 0; k < m; k++) {
						sum[k] += a[j][k];
					}
					cost += c[j];
				}
			}
			for(int j = 0; j < m; j++) {
				if(sum[j] < x) {
					check = 1;
					break;
				}
			}
			if(check==0) {
				money.add(cost);
			}
		}
		if(money.isEmpty()) {
			System.out.println(-1);
			return;
		}
		Collections.sort(money);
		System.out.println(money.get(0));

	}
}