
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「
		int MAX = 100000000;
		boolean [] prime = new boolean[MAX + 1];
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
			for(int i=n;; i--){
				if(prime[i] && prime[i-2] &&prime[i-6] &&prime[i-8]){
					System.out.println(i);
					break;
				}
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}