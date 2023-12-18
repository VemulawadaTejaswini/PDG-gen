import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		for (int i = 0; i < n; i++) {
			prices[i]=sc.nextInt();
		}
		int min = prices[0];
		int prof = -99999999;
		for (int i = 0; i < n; i++) {
			prof = Math.max(prof, prices[i]-min);
			min = Math.min(min,prices[i]);
		}
		System.out.println(prof);
	}
}
