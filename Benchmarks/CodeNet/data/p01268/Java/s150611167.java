import java.util.*;

import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] Eratosthenes(int n) {
		boolean[] dp = new boolean[n+1];
		dp[0] = dp[1] = true;
		List<Integer> prime = new LinkedList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (dp[i]) continue;
			prime.add(i);
			for (int j = i + i; j <= n; j += i) 
				dp[j] = true;
		}
		
		int[] ret = new int[prime.size()];
		int count = 0;
		for (int num : prime)
			ret[count++] = num;
		
		return ret;
	}
	
	void run() {
		int n, p;
		int[] prime = Eratosthenes(200275);
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			n = sc.nextInt();
			p = sc.nextInt();
			if (n == -1) return;
			int index = 0;
			while (prime[index] <= n) index++;
			list.clear();
			for (int i = index; i < index+100; i++) {
				for (int j = i; j < index+100; j++) {
					list.add(prime[i]+prime[j]);
				}
			}
			Collections.sort(list);
			out.println(list.get(p-1));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}