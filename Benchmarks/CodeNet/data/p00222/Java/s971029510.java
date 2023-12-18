
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「
		final int MAX = 1000000;
		boolean [] prime = new boolean[MAX + 1];
		for(int i=3; i <= MAX; i+= 2){
			prime[i] = true;
		}
		for(int i=3; i * i <= MAX; i+= 2){
			if(prime[i]){
				for(int j = i*3; j <= MAX; j += i*2){
					prime[j] = false;
				}
			}
		}
		int n = sc.nextInt();
		while(n!=0){
			if(n % 2 == 0) n--;
			for(int i=n;i >= 13; i-= 2){
				if(prime[i] && prime[i-2] &&prime[i-6] &&prime[i-8]){
					System.out.println(i);
					break;
				}
			}
			n = sc.nextInt();
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}