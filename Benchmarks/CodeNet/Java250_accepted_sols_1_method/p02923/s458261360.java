import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
      	int boxes = scan.nextInt();
      	int[] squareBoxes = new int[boxes];
      	int[] dp = new int[boxes];
      	int max = 0;
      	dp[boxes-1]=0;
      	for(int i=0; i<boxes; i++){
        	squareBoxes[i]=scan.nextInt();
        }
      	
      	for(int i=boxes-2; i>=0; i--) {
        	if(squareBoxes[i]>=squareBoxes[i+1]) {
            	dp[i]=dp[i+1]+1;
            }else{
              	dp[i]=0;
            }
          	max=Math.max(dp[i],max);
        }
      	System.out.println(max);
    }
}