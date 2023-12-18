import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int max = 50001;
	static boolean[] isPrime = new boolean[max];
	public static void main(String[] args) {
		aryPrime();
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int m = 50000;
		for(int i = 2; i <= m; i++) {
			if(isPrime[i]) {
				list.add(i);
			}
		}
		int[] dp = new int[m + 1];
		for(int p1 : list) {
			for(int p2 : list) {
				if(p1 < p2) break;
				int idx = p1 + p2;
				if(idx > m) break;
				dp[idx]++;
			}
		}
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(dp[n]);
		}
		sc.close();


	}
	static void aryPrime(){
        int l = isPrime.length;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(l); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
