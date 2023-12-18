

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] h = new int[n];
		int[] cost = new int[n];
		
		for(int i = 0; i < h.length; i++) {
			h[i] = scan.nextInt();
		}
		
		for(int i = 0; i < h.length; i++) {
			if(i == 0) {
				cost[i] = 0;
			}else if(i == 1) {
				cost[i] = Math.abs(h[i] - h[i-1]) + cost[i-1];
			}else {
				cost[i] = Math.abs(h[i] - h[i-2]) + cost[i-2];
				if(cost[i] > Math.abs(h[i] - h[i-1]) + cost[i-1]) {
					cost[i] = Math.abs(h[i] - h[i-1]) + cost[i-1];
				}
			}
		}
		
		scan.close();
		/*
		 * for(int i = 0; i < cost.length;i++) { System.out.println(cost[i]); }
		 */
		
		System.out.println(cost[cost.length-1]);
		
	}

}
