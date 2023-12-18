import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX = 123457;
		
		boolean[] isPrime = new boolean[2*MAX];
		for(int i = 0; i < 2*MAX; i++){
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i < 2*MAX; i++){
			if(isPrime[i]){
				for(int j = i*2; j < 2*MAX; j+=i){
					isPrime[j] = false;
				}
			}
		}
		
		while(true){
			int n = sc.nextInt();
		
			if(n == 0){
				break;
			}
			
			int count = 0;
			for(int i = n+1; i <= 2*n; i++){
				if(isPrime[i]){
					count++;
				}
			}
		
			System.out.println(count);
		}
		
		
	}
}	