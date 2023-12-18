
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean isPrime[]=new boolean[2<<15+1];
	static int primes[]=new int[12251];
	static{
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2;i*i<=isPrime.length;i++){
			if(isPrime[i]){
				for(int j = i+i;j<isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
		int count=0;
		for(int i = 0;i<isPrime.length;i++){
			if(isPrime[i]){
				primes[count++]=i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0)break;
			int ans=0;
			ans=0;
			for(int i = 0;primes[i]<=n/2;i++){
				if(isPrime[n-primes[i]]){
					ans++;
				}
			}
			System.out.println(ans);
		}
		
	}

}