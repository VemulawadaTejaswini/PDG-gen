import java.util.Arrays;
import java.util.Scanner;


public class A2011 {
	
	public static final int MAX = 123456;
	
	public static void main(String[] args) {
		boolean[] is_prime = new boolean[MAX * 2 + 1];
		
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		for(int i = 0; i <= MAX * 2; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= MAX * 2; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		int[] count = new int[MAX * 2 + 1];
		
		for(int i = 0; i <= MAX * 2; i++){
			if(is_prime[i]){
				count[i] = 1;
			}
		}
		
		for(int i = 1; i <= MAX * 2; i++){
			count[i] += count[i-1];
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(count[2*n] - count[n]);
		}
		
		sc.close();
	}

}