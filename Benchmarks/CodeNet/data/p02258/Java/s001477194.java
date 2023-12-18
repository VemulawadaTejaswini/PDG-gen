import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int computeMaxProfit(int n, int[] R) {
		int max = -999999999;
		int min = R[0];
		
		for(int i = 1; i < n; i++) {
			max = Math.max(max, R[i] - min);
			min = Math.min(min, R[i]);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] R = new int[n];
		for(int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		
		System.out.println(computeMaxProfit(n, R));
		
	}
}

