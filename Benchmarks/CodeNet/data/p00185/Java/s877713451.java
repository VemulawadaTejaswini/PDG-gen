
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「ツ（ツ甘ッツ青板づ個づ敖）
		final int MAX = 1000000;
		boolean [] prime = new boolean[MAX + 1];
		for(int i=3; i <= MAX; i+= 2){
			prime[i] = true;
		}
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
			int count = 0;
			for(int i=3; i <= n/2; i += 2){
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