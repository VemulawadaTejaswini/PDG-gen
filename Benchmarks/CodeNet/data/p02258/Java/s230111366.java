//Algo 2

import java.util.Scanner;

public class Main {
	
	public static int maxProfit1(int n, int[] R) {
		
		int max = R[1] - R[0];
		
		for (int i = 0; i < n; i++) {
		
			for (int j = i + 1; j < n; j++) {
				
				if ((R[j] - R[i]) > max) { 
					max = R[j] - R[i]; 
					}
				
				//System.out.println(max);
			
			} }
		
		return max;
	
	}
	
	public static int maxProfit2(int n, int[] R) {
		int min = R[0];
		int max = R[1] - R[0];
		for (int i = 1; i < n; i++) {
			//System.out.println(max);
			max = (R[i] - min) > max ? R[i] - min : max;
			if (min > R[i]) min = R[i];
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] R = new int[n];
		for (int i = 0; i < n; i++) {
			R[i] = s.nextInt();
		}
		
		//System.out.println(maxProfit1(n, R));
		System.out.println(maxProfit2(n, R));
		
		
	}
	

}
