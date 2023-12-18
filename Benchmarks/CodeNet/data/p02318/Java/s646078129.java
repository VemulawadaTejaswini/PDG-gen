public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int[][] dp= new int[1010][1010];
        int count=0;
        for(int i=0; i<s1.length(); i++) {
        	if(s1.charAt(0)!=s2.charAt(0))
        		dp[i][0]=i+1;
        	else
        		dp[i][0]=i;
        }
        for(int i=0; i<s2.length(); i++) {
        	if(s1.charAt(0)!=s2.charAt(0))
        		dp[0][i]=i+1;
        	else 
        		dp[0][i]=i;
        }
        
        for(int i=1; i<s1.length(); i++) {
        	for(int j=1; j<s2.length(); j++) {
        		
        		if(s1.charAt(i)==s2.charAt(j)) {
        			count=0;
        		}
        		else {
        			count=1;
        		}
        		dp[i][j]=Math.min(dp[i-1][j-1]+count, Math.min(dp[i-1][j]+1, dp[i][j-1]+1));
        	}
        }
        
        System.out.println(dp[s1.length()-1][s2.length()-1]);
	}
}
