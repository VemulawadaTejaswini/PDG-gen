import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2199().doIt();
    }
    class aoj2199{
    	int dp[][] = new int[20001][256];
    	int C[] = new int[16];
    	int x[] = new int[20001];
    	int MAX = 10000000;
    	void set(int N,int M){
    		for(int i = 0;i <= N;i++){
    			for(int j = 0;j < 256;j++){
    				dp[i][j] = MAX;
    			}
    		}
    		for(int i = 0;i < M;i++)C[i] = sc.nextInt();
    		for(int i = 0;i < N;i++)x[i] = sc.nextInt();
    	}
    	int dp_table(int N,int M){
    		dp[0][128] = 0;
    		for(int i = 0;i < N;i++){
    			for(int j = 0;j < 256;j++){
    				if(dp[i][j] == MAX)continue;
    				for(int k = 0;k < M;k++){
    					int y = j + C[k];
    					if(y > 255)y = 255;
    					else if(y < 0)y = 0;
    					dp[i+1][y] = Math.min(dp[i+1][y],dp[i][j] + (x[i] - y)*(x[i] - y));
    				}
    			}
    		}
    		int min = MAX;
    		for(int i = 0;i < 256;i++)min = Math.min(min,dp[N][i]);
    		return min;
    	}
    	void doIt(){
    		while(true){
    			int N = sc.nextInt();
    			int M = sc.nextInt();
    			if(N + M == 0)break;
    			set(N,M);
    			System.out.println(dp_table(N,M));
    		}
    	}
    }
}