import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	//DP
	int DP(int xy[][],int DP[][]){
		for(int i = 1;i < 1001;i++){
			for(int j = 1;j < 1001;j++){
				if(xy[i][j] == 1){
					if(DP[i][j-1] < DP[i-1][j]){
						DP[i][j] = DP[i][j-1] + 1;
					}
					else{
						DP[i][j] = DP[i-1][j] + 1;
					}
				}else{
					if(DP[i][j-1] < DP[i-1][j]){
						DP[i][j] = DP[i-1][j];
					}
					else{
						DP[i][j] = DP[i][j-1];
					}
				}
			}
		}
		return DP[1000][1000];
	}
	//最短距離
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int xy[][] = new int[1001][1001];
			int DP[][] = new int[1001][1001];
			for(int i = 0;i < n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				xy[a][b] = 1;
			}
			int m = sc.nextInt();
			for(int i = 0;i < m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				xy[a][b] = 1;
			}
			System.out.println(DP(xy,DP));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}