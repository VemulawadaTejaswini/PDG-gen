import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new DPL5().doIt();
    }
    class DPL5{
    	int dpT(int dp[][],char ctra[],char ctrb[]){
    		int lengtha = ctra.length;
    		int lengthb = ctrb.length;
    		if(ctra[0] != ctrb[0])dp[0][0] = 1;
    		for(int i = 0;i < lengtha;i++){
    			for(int j = 0;j < lengthb;j++){
    				dp[i][j] = (ctra[i] != ctrb[j] ? 1:0);
    				if(i > 0 && j > 0)dp[i][j] += dp[i-1][j-1];
    			}
    		}
    		int max = Math.max(lengtha,lengthb);
    		int min = Integer.MAX_VALUE;
    		for(int i = 0;i < lengthb;i++){
    			dp[lengtha-1][i] += (max-i-1);
    			min = Math.min(min,dp[lengtha-1][i]);
    		}
    		for(int i = 0;i < lengtha;i++){
    			dp[i][lengthb-1] += (max-i-1);
    			min = Math.min(min,dp[i][lengthb-1]);
    		}
    		//check
//    		for(int i = 0;i < lengtha;i++){
//    			for(int j = 0;j < lengthb;j++){
//    				System.out.print(dp[i][j]+" ");
//    			}
//    			System.out.println();
//    		}
    		return min;
    	}
    	void doIt(){
    		String stra = sc.next();
    		String strb = sc.next();
    		char ctra[] = stra.toCharArray();
    		char ctrb[] = strb.toCharArray();
    		int dp[][] = new int[ctra.length][ctrb.length];
    		System.out.println(dpT(dp,ctra,ctrb));
    	}
    }
}