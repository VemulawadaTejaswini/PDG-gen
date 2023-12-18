import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	int[][] melody = new int[n][3];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < 3; j++){
    			melody[i][j] = sc.nextInt();
    		}
    	}
    	
    	int[] dp = new int[393 + 1];
    	Arrays.fill(dp, -1);
    	dp[0] = 0;
    	
    	for(int i = 0; i < n; i++){
    		for(int len = melody[i][0]; len <= melody[i][1]; len++){
    			for(int j = 0; j <= 393 - len; j++){
    				if(dp[j] >= 0){
    					dp[j + len] = Math.max(dp[j + len], dp[j] + melody[i][2]);
    				}
    			}
    		}
    	}
    	
    	//System.out.println(Arrays.toString(dp));
    	
    	final int m = sc.nextInt();
    	
    	int[] array = new int[m];
    	for(int i = 0; i < m; i++){
    		array[i] = dp[sc.nextInt()];
    		if(array[i] == -1){
    			System.out.println(-1);
    			return;
    		}
    	}
    	
    	for(int num : array){
    		System.out.println(num);
    	}
    }
     
}