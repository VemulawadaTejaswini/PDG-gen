import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int index = 1;
        while(true){
            int W = input.nextInt();
        	if(W == 0)break;
        	int num = input.nextInt();
        	input.nextLine();
        	int[] v = new int[num];
        	int[] w = new int[num];
        	for(int i = 0 ; i < num ; i++){
        		String[] st = input.nextLine().split(",");
        		v[i] = Integer.parseInt(st[0]);
        		w[i] = Integer.parseInt(st[1]);
        	}
        	System.out.println("Case "+index+":");
        	treasure(v,w,num,W);
        	index++;
        }
    }

    public static void treasure(int[] v,int[] w,int N,int W){
    	int[][] dp = new int[N+1][W+1];//v,w
    	for(int i = N-1 ; i >= 0 ; i--){
    		for(int j = 0 ; j <= W ; j++){
    			if(j < w[i]){
    				dp[i][j] = dp[i+1][j];
    			}else{
    				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-w[i]]+v[i]);
    			}
    		}
    	}
    	int var = 0;
    	int weight = 0;
    	for(int i = 0 ; i < W ; i++){
    		if(var < dp[0][i]){
    			var = dp[0][i];
    			weight = i;
    		}
    	}
    	System.out.println(var);
    	System.out.println(weight);
    }
}