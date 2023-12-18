import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 20000;
	public static final int SQRT = (int)(Math.ceil(Math.sqrt(MAX)));
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int t = sc.nextInt();
		
		boolean[] is_prime = new boolean[MAX + 1];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		for(int i = 2; i <= SQRT; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		for(int tt = 0; tt < t; tt++){
			final int m = Math.abs(sc.nextInt());
			final int n = Math.abs(sc.nextInt());
			
			final int divide = m * m + n * n;
			/*
			int max = Math.max(Math.abs(m), Math.abs(n));
			
			max *= max;
			
			int count = 0;
			for(int p = -divide; p <= divide; p++){
				for(int q = -divide; q <= divide; q++){
					final int x_ = m * p + n * q;
					final int y_ = m * q - n * p;
					
					//System.out.println(p + " " + q);
					
					if(x_ % divide != 0 || y_ % divide != 0){
						continue;
					}else if(x_ == 0 && y_ == 0){
						continue;
					}
					
					final int x = x_ / divide;
					final int y = y_ / divide;
					
					final int pq = p * p + q * q;
					final int divide2 = x * x + y * y;
					
					if(divide * divide2 != pq){
						continue;
					}
					
					System.out.println("=> " +  p + " " + q + " " + x + " " + y);
					
					count++;
				}
			}
			*/
			
			boolean flag = false;
			
			if(m != 0 && n != 0){
				flag = is_prime[divide];
			}else if(m == 0){
				flag = is_prime[n] && n % 4 == 3;
			}else if(n == 0){
				flag = is_prime[m] && m % 4 == 3;
			}
			System.out.println(flag ? "P" : "C");
		}
		
	}

}