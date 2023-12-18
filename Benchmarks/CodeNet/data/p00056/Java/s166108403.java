
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);


		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「
		final int MAX = 50000;
		boolean [] prime = new boolean[MAX + 1];
		for(int i=2; i < prime.length; i++){
			prime[i] = true;
		}
		for(int i=2; i * i < MAX; i++){
			if(prime[i]){
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
			int count = 0;
			for(int i=2; i <= n/2; i++){
				if(prime[i] && prime[n-i]){
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