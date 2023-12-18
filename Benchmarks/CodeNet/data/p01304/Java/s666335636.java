import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int rept=0; rept<n; rept++){
			int x = in.nextInt(), y = in.nextInt();
			int dp[][] = new int[x+1][y+1];
			HashSet<Integer> obs = new HashSet<Integer>();
			int m = in.nextInt();
			for(int l=0; l<m; l++){
				int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
				obs.add(new Integer(sub(x1,y1,x2,y2)));
				obs.add(new Integer(sub(x2,y2,x1,y1)));
			}
			dp[0][0] = 1;
			for(int i=1; i<=x; i++){
				if(!obs.contains(new Integer(sub(i-1,0,i,0)))){
					dp[i][0] += dp[i-1][0];
				}
			}
			for(int j=1; j<=y; j++){
				if(!obs.contains(new Integer(sub(0,j-1,0,j)))){
					dp[0][j] += dp[0][j-1];
				}
			}
			for(int i=1; i<=x; i++){
				for(int j=1; j<=y; j++){
					if(!obs.contains(new Integer(sub(i-1,j,i,j)))){
						dp[i][j] += dp[i-1][j];
					}
					if(!obs.contains(new Integer(sub(i,j-1,i,j)))){
						dp[i][j] += dp[i][j-1];
					}
				}
			}
			if(dp[x][y]==0) System.out.println("Miserable Hokusai!");
			else System.out.println(dp[x][y]);
		}
	}
	
	private static int sub(int x1, int y1, int x2, int y2){
		return x1*(1<<20) + y1*(1<<15) + x2*(1<<10) + y2*(1<<5);
	}
	
}