import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 999999;
		int calcMax, count, n;
		int[] primeCount = new int[max+1];	//めんどいので、index=対象の数とする
		boolean[] isPrime = new boolean[max+1];
		Scanner sin = new Scanner(System.in);

		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		primeCount[0] = primeCount[1] = 0;

		calcMax = (int) Math.sqrt(max);
		for(int i=2; i<=calcMax; i++) {
			if(isPrime[i] ==true) {
				for(int j=i*i; j<=max; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		count = 0;
		for(int i=0; i<=max; i++) {
			if(isPrime[i]) {
				count++;
			}
			primeCount[i] = count;
		}

		while(sin.hasNext()) {
			n = sin.nextInt();
			System.out.println(primeCount[n]);
		}
		sin.close();
	}

}

