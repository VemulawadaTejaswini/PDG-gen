import java.io.*;
class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strLine = br.readLine();
      String costsLine = br.readLine();
      int n = Integer.parseInt(strLine);
      String[] costs = costsLine.split(" ");
	  int[] dp = new int[n];
      dp[0] = 0;
      dp[1] = Math.abs(Integer.parseInt(costs[1]) - Integer.parseInt(costs[0]));
      for(int i = 2; i < n ; i++) {
      	
        dp[i] = Math.min(dp[i-2] + Math.abs(Integer.parseInt(costs[i]) - Integer.parseInt(costs[i-2])), 
                         dp[i-1] + Math.abs(Integer.parseInt(costs[i]) - Integer.parseInt(costs[i-1])));
        
      } 
    
      System.out.println(dp[n-1]);
		                         
    } catch(Exception ex) {
    
    }
  
  }

}