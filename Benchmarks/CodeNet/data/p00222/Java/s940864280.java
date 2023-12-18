
import java.util.*;
public class Main {

	final int MAX = 10000;
	boolean [] prime = new boolean[MAX + 1];

	//f©Ç¤©ð»Ê·éÖ
	private boolean isPrime(int n){
		for(int i=3; i * i <= n; i+=2){
			if(n % i  == 0){
				return false;
			}
		}
		return true;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//GgXelXÌÓé¢
		for(int i=3; i <= MAX; i+= 2){
			prime[i] = true;
		}
		prime[2] = true;
		for(int i=3; i * i <= MAX; i+= 2){
			if(prime[i]){
				for(int j = i + i + i; j <= MAX; j += i + i){
					prime[j] = false;
				}
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			if(n % 2 == 0){
				n--;
			}
			for(int i=n;; i-= 2){
				if(n > 10000){
					if(isPrime(i) && isPrime(i-2) && isPrime(i-6) && isPrime(i-8)){
						System.out.println(i);
						break;
					}
				}
				else{
					if(prime[i] && prime[i-2] &&prime[i-6] &&prime[i-8]){
						System.out.println(i);
						break;
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