import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static boolean[] primes = new boolean[123456*2+1];

	static void Furui(){
		Arrays.fill(primes, true);
		for(int i=2; i<=123456*2; i++){
			if(!primes[i]) continue;
			int j = i + i;
			while(j<=123456*2){
				primes[j] = false;
				j += i;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Furui();

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int cnt = 0;
			for(int i=n+1; i<=2*n; i++){
				if(primes[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
}