import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] primes;

	static void primeSet(final int MAX){
		primes = new boolean[MAX+1];

		primes[2] = true;
		for(int i=3;i<=MAX;i+=2){
			primes[i] = true;
		}
		int rt = (int) Math.sqrt(MAX);
		for(int i=3;i<=rt;i+=2){
			if(primes[i]){
				for(int j=i*i;j<=MAX;j+=i){
					primes[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			primeSet(n+2);
			int cnt = 0;
			for(int i=1;i<=n;i++){
				if(primes[i]&&primes[n-i+1]){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}