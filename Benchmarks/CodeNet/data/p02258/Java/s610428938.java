import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		int[] R = new int[(int) n];
		Operations op = new Operations();
		
		for (int i = 0; i < n; i++) {
			in.nextLine();
			R[i] = in.nextInt();
		}
		
		System.out.println(op.compute_maxprofitTwo((int) n, R));
		
	}

}

class Operations {
	
	public int compute_maxprofitOne(int n, int[] R) {
		int max_profit = -999999999;
		for (int i = 0; i < n - 1; i++) {
			for(int j =  i + 1; j < n; j++) {
				if(R[j] - R[i] > max_profit) {
					max_profit = R[j] - R[i];
				}
			}
		}
		return max_profit;
	}
	
	public int compute_maxprofitTwo(int n, int[] R) {
		int max_profit = 0;
		int[] p = new int[n];
		
		int min = R[0];
		p[1] = R[1] - R[0];
		
		for (int i = 2; i < n; i++) {
			if (R[i - 1] < min) {
				min = R[i - 1];
			}
			int sell = R[i] - min;
			if (sell > p[i - 1]) {
				p[i] = sell;
			} else {
				p[i] = p[i - 1];
			}
		}
		
		return p[n - 1];
	}
	
}
