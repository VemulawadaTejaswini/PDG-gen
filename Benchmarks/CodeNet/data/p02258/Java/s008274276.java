import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTimes = in.nextInt();
		int[] values = new int[numTimes];
		for (int i = 0; i < numTimes; i++) {
			values[i] = in.nextInt();
		}
		//finished importing values, now maxing
		System.out.println(MP_DP(numTimes, values));
	}
	static int MP(int n, int[] values) {
		int maxp = -2000000000; //taken from yye
		// n = time points, values = array
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j<n; j++) {
				if (values[j] - values[i] > maxp) {
					maxp = values[j] - values[i];
				}
			}
		}
		return maxp;
	}
	static int MP_DP(int n, int[] values) {
		int maxp = values[1] - values[0];
		int minv = Math.min(values[1], values[0]);
		for (int i = 2; i < n; i++) {
			//Sell on day i
			maxp = Math.max(maxp,  values[i] - minv);
			// Sell vs not sell; which is max?
			minv = Math.min(minv, values[i]);
			// new lowest price to buy
		}
		return maxp;
	}
	
	
}

