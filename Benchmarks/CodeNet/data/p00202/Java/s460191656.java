import java.util.*;
public class Main {
	public static int[] val;
	public static int n;
	public static int x;
	public static boolean[] dp;
	public static int[] PrimeTable;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while (true) {
			
			n = stdIn.nextInt();
			x = stdIn.nextInt();
			
			if(n == 0 && x == 0) {
				break;
			}
			
			val = new int[n];
			for (int i = 0; i < n; i++) {
				val[i] = stdIn.nextInt();
			}
			dp = new boolean[x + 1];
			PrimeTable = new int[x + 1];
			dp();
			createPrimeTable(x);
			Arrays.sort(PrimeTable);
			int ans = 0;
			for (int i = x - 1; i >= 2; i--) {
				if (dp[i] && Arrays.binarySearch(PrimeTable, i) >= 0) {
					ans = i;
					break;
				}
			}
			if (ans != 0) {
				System.out.println(ans);
			} else {
				System.out.println("NA");
			}
		}
	}
	
	public static void dp() {
		dp[0] = true;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= x; j++) {
				if(dp[j] == true) {
					
					if(j + val[i] <= x) {
						dp[j + val[i]] = true;
					}
				}
			}
		}
	}
	
	public static void createPrimeTable(int x) {
		//xまでの素数テーブルを作成
		boolean[] isPrime = new boolean[x+1];
		for(int i = 2; i < x+1; i++) {
			isPrime[i] = true;
		}
		int counter = 0;
		for(int i = 2; i < Math.sqrt(x+1); i++) {
			if(isPrime[i]) {
				for(int j = i * 2; j < x+1; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for(int i = 0; i < x+1; i++) {
			if(isPrime[i]) {
				PrimeTable[counter++] = i;
			}
		}
		
	}
	
}