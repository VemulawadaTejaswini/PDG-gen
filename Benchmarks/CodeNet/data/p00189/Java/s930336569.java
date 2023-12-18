import java.util.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n, mm;
	static int[][] cost;
	
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		
		int from, to, c;
		cost = new int[10][10];
		for(int i = 0; i < 10; i++) Arrays.fill(cost[i], 999999);
		for(int i = 0; i < 10; i++) cost[i][i] = 0;
		mm = 0;
		for(int i = 0; i < n; i++) {
			from = sc.nextInt(); to = sc.nextInt(); c = sc.nextInt();
			cost[from][to] = cost[to][from] = c;
			mm = max(mm, from); mm = max(mm, to);
		}
		
		return true;
		
	}
	
	static String solve() {
				
		for(int i = 0; i <= mm; i++) {
			for(int j = 0; j <= mm; j++) {
				for(int k = 0; k <= mm; k++) {
					cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
				}
			}
		}
		
		int min = 999999 * 10, idx = 0, sum;
		for(int i = 0; i <= mm; i++) {
			sum = 0;
			for(int j = 0; j <= mm; j++) {
				if(cost[i][j] != 999999) {
					sum += cost[i][j];
				}
			}
			if(sum < min) {
				idx = i;
				min = sum;
			}
		}
		
		return "" + idx + " " + min;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}