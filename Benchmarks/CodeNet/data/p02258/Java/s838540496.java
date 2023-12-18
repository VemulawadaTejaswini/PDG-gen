import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int n;
		int[] R;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		R = new int[n];
		for(int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		System.out.println(compute_maxprofit(n,R));
	}
	
	public static int compute_maxprofit(int n, int[] R) {
		int max_profit = R[1] - R[0];
		int min_profit = R[0];
		for(int i = 1; i < n; i++) {
		    if(max_profit < R[i] - min_profit){
		        max_profit = R[i] - min_profit;
		    }
		    if(min_profit > R[i]){
		        min_profit = R[i];
		    }
		}
		return max_profit;
	}
}

