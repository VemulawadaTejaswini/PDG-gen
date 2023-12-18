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
    		int min = Integer.MAX_VALUE;
    		for(int i = 0;i < lengthb;i++){
    			if(i + lengthb > lengtha)dp[0][i] = dp[0][i-1] + 2;
    			else dp[0][i] = lengtha - lengthb;
    		}
    		for(int i = 1;i < lengtha;i++){
    			dp[i][0] = dp[i-1][0] + 2;
    		}
    		for(int i = 0;i < lengtha;i++){
    			for(int j = 0;j < lengthb;j++){
    				dp[i][j] = dp[i][j] + (ctra[i] != ctrb[j] ? 1:0);
    				if(i > 0 && j > 0)dp[i][j] += dp[i-1][j-1];
    				if(j == lengthb-1 || i == lengtha-1)min = Math.min(dp[i][j], min);
    			}
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
    		int dp[][];
    		if(ctra.length > ctrb.length){
    			dp = new int[ctra.length][ctrb.length];
    			System.out.println(dpT(dp,ctra,ctrb));
    		}else{
    			dp = new int[ctrb.length][ctra.length];
    			System.out.println(dpT(dp,ctrb,ctra));
    		}
    	}
    }
}