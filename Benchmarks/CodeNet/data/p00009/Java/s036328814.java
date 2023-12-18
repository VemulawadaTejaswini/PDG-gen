

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(((str=sc.nextLine())!=null)&&(!str.trim().equals(""))) {
			int n = Integer.parseInt(str);
			int ans = sieve(n);
			System.out.println(ans);
		}
	}
	
	public static int sieve(int n) {
		int[] prime = new int[Integer.MAX_VALUE];
		boolean[] is_prime = new boolean[Integer.MAX_VALUE];
		
		int p = 0;
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i <= n; i++) {
			if(is_prime[i]) {
				prime[p++] = i;
				for (int j = 2*i; j <= n; j+=i) {
					is_prime[j] = false;
				}
			}
		}
		return p;
	}

}

