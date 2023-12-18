import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static int compute_maxprofit(int n, int[] R){
	    int max_profit = -100000000;
	    int min = 0;
	    if (n > 2){
    	    for (int i = 0; i < n-2; i++){
    	        if (i == 0){
    	            min = Math.min(R[i], R[i+1]);
    	        }
    	        else{
    	            min = Math.min(R[i+1], min);
    	        }
    	        max_profit = Math.max(max_profit, R[i+2] - min);
    	    }
    	}
	    else{
	        max_profit = R[1] - R[0];
	    }
	    return max_profit;
	}
	
	
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbs = new int[n];
		for (int i = 0; i < n; i++) {
			numbs[i] = in.nextInt();
		}
		System.out.println(compute_maxprofit(n,numbs));
	}
}
