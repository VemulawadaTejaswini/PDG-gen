
import java.util.*;
public class Main {

	final int MAX = 999999;

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

		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			for(int i = 2; i <= n; i++){
				if(prime[i]){
					count++;
				}
			}
			System.out.println(count);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}