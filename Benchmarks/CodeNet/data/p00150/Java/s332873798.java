
import java.util.*;
public class Main {

	private boolean isPrime(int n){
		for(int i=2; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「
		final int MAX = 999999;
		boolean [] prime = new boolean[MAX + 1];
		for(int i=2; i < prime.length; i++){
			prime[i] = true;
		}
		for(int i=2; i * i < MAX; i++){
			if(isPrime(i)){
				for(int j = i + i; j <= MAX; j += i){
					prime[j] = false;
				}
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int prePrimeInd = 0;
			for(int i = n;;i--){
				if(prime[i]){
					//ツ催渉可づ按づァpreツづ可禿シツづェツづゥ
					if(prePrimeInd == 0){
						prePrimeInd = i;
						continue;
					}
					//ツ催渉可出ツづ按つ「ツづ按づァツ、indexツづ個債キツつェツ２ツつゥツづつ、ツつゥ
					if(prePrimeInd - i == 2){
						System.out.println(i + " " + prePrimeInd);
						break;
					}
					else{
						prePrimeInd = i;
					}
				}
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}