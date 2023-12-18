import java.math.BigInteger;
import java.util.*;

public class Main {
	
	int a,d,n, MAX = 1000000;
	boolean [] isprime;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(true){
			a = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
			if((a|n|d) == 0) break;
			for(int i = a ; i <= MAX; i+= d){
				if(isprime[i]){
					n--;
					if(n == 0){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

	private void init() {
		isprime = new boolean[MAX + 1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for(int i = 0 ; i * i <= MAX; i++){
			if(isprime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					isprime[j] = false;
				}
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}