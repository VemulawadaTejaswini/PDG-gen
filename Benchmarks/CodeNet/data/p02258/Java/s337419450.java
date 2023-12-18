import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] R = new int[n];
		for(int x=0; x<n; x++) {
			R[x] = scanner.nextInt();
		}
		scanner.close();
		//System.out.println(Arrays.toString(R));
		//int xx = compute_maxprofit(n,R);
		compute_maxprofit(n,R);
	}
	
	
	public static void compute_maxprofit(int n, int[] R) {
		int min = R[0];  //first number
		int max = Integer.MIN_VALUE;
		for(int x=1; x<n; x++) {
			/*if( R[x] - min> max) {
				max = R[x] - min;
			}*/
			max = Math.max(R[x] - min, max);
			if(R[x] < min) {
				min = R[x];
			}
		}
		System.out.println(max);
		//return max;
	}
}
