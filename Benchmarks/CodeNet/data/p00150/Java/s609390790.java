import java.util.Scanner;


public class Main {

	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		boolean primes[] = new boolean[10001];
		
		primes[0] = false;
		primes[1] = false;
		for(int i = 2; i < 10001; i++){
			primes[i] = true;
		}
		
		for(int i = 2; i < 101; i++){
			if(primes[i]){
				for(int j = 2*i; j < 10001; j += i){
					primes[j] = false;
				}
			}
		}
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int twin = 5;
			for(int i = 5; i < N; i++){
				if(primes[i] && i < (N - 2) && primes[i+2]){
					twin = i;
				}
			}
			
			System.out.println(twin + " " + (twin + 2));
		}
		
	}
}