import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[] isPrime = new boolean[123456*2 + 10];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2; i*i <= isPrime.length; i++){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			for(int i = n+1; i <= 2*n; i++){
				if(isPrime[i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}