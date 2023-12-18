import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] primes;

	static void primeSet(final int MAX){
		primes = new boolean[MAX+1];

		primes[2] = true;
		for(int i=3;i<=MAX;i+=2){
			primes[i] = true;
		}
		int rt = (int) Math.sqrt(MAX);
		for(int i=3;i<=rt;i+=2){
			if(primes[i]){
				for(int j=i*i;j<=MAX;j+=i){
					primes[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int p = stdIn.nextInt();
			if(n==-1&&p==-1){
				return;
			}
			primeSet(n+1000);
			int[] u = new int[50];
			int idx = n+1;
			int z = 0;
			for(int i=idx;z<u.length;i++){
				if(primes[i]){
					u[z++] = i;
				}
			}
			z = 0;
			int[] v = new int[1000];
			A:{
				for(int i=0;i<u.length;i++){
					for(int j=i;j<u.length;j++){
						v[z++] = u[i] + u[j];
						if(z==1000){
							break A;
						}
					}
				}
			}
			Arrays.sort(v);
			System.out.println(v[p-1]);
		}
	}
}