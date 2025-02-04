import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n= scan.nextInt();
      	int k = scan.nextInt();
      	int[] h = new int[n];
     	for(int i = 0; i < n; i++){
        	h[i] = scan.nextInt();
        }
      	Arrays.sort(h);
      	int ans = Integer.MAX_VALUE;
      	for(int j = 0; j < n - k + 1; j++){
        	ans = Math.min(ans, h[j + k - 1] - h[j]);
        }
      	System.out.print(ans);
    }
 
}