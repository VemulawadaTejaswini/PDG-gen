    import java.util.*;
    public class Main{
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		int h=sc.nextInt();
    		int w=sc.nextInt();
    		int[][] a=new int[h+1][w+1];
    		int[][] b=new int[h+1][w+1];
    		for(int i=1; i<=h; i++){
    			for(int j=1; j<=w; j++){
    				a[i][j]=sc.nextInt();
    			}
    		}
    		for(int i=1; i<=h; i++){
    			for(int j=1; j<=w; j++){
    				b[i][j]=sc.nextInt();
    			}
    		}
    		boolean[][][] dp=new boolean[h+1][w+1][160*80];
    		dp[1][1][Math.abs(a[1][1]-b[1][1])]=true;
    		for(int j=1; j<=h; j++){
    			for(int t=1; t<=w; t++){
    				int k1=Math.abs(a[j][t]-b[j][t]);
    				for(int i=0; i<160*80; i++){
    					if(j-1>=1 && dp[j-1][t][i]){
    						dp[j][t][Math.abs(i-k1)]=true;
    						dp[j][t][i+k1]=true;
    					}else if(t-1>=1 && dp[j][t-1][i]){
    						dp[j][t][Math.abs(i-k1)]=true;
    						dp[j][t][i+k1]=true;
    					}
    				}
    			}
    		}
    		for(int i=0; i<160*80; i++){
    			if(dp[h][w][i]){
    				System.out.println(i);
    				break;
    			}
    		}
    	}
    }