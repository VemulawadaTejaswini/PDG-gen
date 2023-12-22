import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean[] isPrime = new boolean[10001];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2; i < isPrime.length; i++){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			for(int i = n; i >= 0; i--){
				if(isPrime[i] && isPrime[i-2]){
					System.out.println((i-2)+" " + i);
					break;
				}
			}
		}

	}

}