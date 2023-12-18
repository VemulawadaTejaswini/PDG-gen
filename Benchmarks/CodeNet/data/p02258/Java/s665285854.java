import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int len = in.nextInt();
		int[] currency = new int[len];
		for(int i = 0; i < len; i++) {
			currency[i] = in.nextInt();
		}
		System.out.println(compute_maxprofit(len, currency));
		in.close();
	}
	
	/* Algorithm 1
	static int compute_maxprofit(int n, int[] r) {
		int max_profit = r[1] - r[0];
		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j++) {
				if(r[j] - r[i] > max_profit)
					max_profit = r[j] - r[i];
			}
		}
		return max_profit;
	}
	*/
	
	/*Algorithm 2*/
	static int compute_maxprofit(int n, int[] r) {
		int min = r[0];
		int max = r[1] - r[0];
		for(int i = 1; i < n; i++) {
			max = Math.max(max, r[i] - min);
			min = Math.min(min, r[i]);
		}
		return max;
	}
}
