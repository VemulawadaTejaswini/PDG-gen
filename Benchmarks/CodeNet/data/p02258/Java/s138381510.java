import java.util.Scanner;

public class Main {
	
	public static int ComputeMaxProfit(int n, int[] r) {
		int maxProfit = Integer.MIN_VALUE;
		int minE = Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			if(minE>r[i]) {
				minE=r[i];
			}
			maxProfit = Math.max(maxProfit, r[i+1] - minE);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] r = new int[n]; 
		for(int i=0;i<n;i++) {
			r[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(ComputeMaxProfit(n,r));
		

	}

}
