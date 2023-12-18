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
				for(int j=i*2;j<=MAX;j+=i){
					primes[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		primeSet(10);
		
		while(true){
			int n = stdIn.nextInt();
			int h = n;
			if(h<4){
				h=8;
			}
			int b[] = new int[h/2+1];
			int nc = n;
			int max = 10;

			if(n==0){
				break;
			}

			if(max<n){
				primeSet(n+1);
			}

			while(true){
				if(n==1){
					break;
				}
				for(int i=2;i<=n;i++){
					if(primes[i]){
						if(n%i==0){
							b[i]++;
							n=n/i;
							break;
						}
					}
				}
			}

			for(int i=2;i*i<nc;i++){
				if(b[i]>0){
//					System.out.println(i+"^"+b[i]); //debug
					int sum=1;
					for(int j=1;j<=b[i];j++){
						sum+=Math.pow(i,j);
					}
					b[i]=sum;
				}
			}

			long ans=1;
			for(int i=2;i*i<nc;i++){
				if(b[i]>0){
//					System.out.println("b["+i+"]="+b[i]);  //debug
					ans*=b[i];
				}
			}
			
			ans-=nc;
//			System.out.println("ans:"+ans);  //debug
			
			if(nc<ans){
				System.out.println("abundant number");
			}
			else if(nc>ans){
				System.out.println("deficient number");
			}
			else if(nc==ans){
				System.out.println("perfect number");
			}
		}
	}
}