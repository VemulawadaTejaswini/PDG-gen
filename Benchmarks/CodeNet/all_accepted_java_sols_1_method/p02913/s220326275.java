import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();        
        
        int[][] dp = new int[N+1][N+1];
        int max=0;
        for(int i=N-1;i>=0;i--) {
        	for(int j=N-1;j>=0;j--) {
        		if(c[i]==c[j]) {
        			dp[i][j]=dp[i+1][j+1]+1;
        			max=Math.max(max, Math.min(dp[i][j], Math.abs(i-j)));
        		}
        	}
        }
        System.out.println(max);  	
               		
    }

}