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

		primeSet(10000000);

		while(true){
			int n = stdIn.nextInt();
			int b[] = new int[10000000];
			int nc = n;
			
			
			if(n==0){
				break;
			}

			while(true){
				if(n==1){
					break;
				}
				for(int i=2;;i++){
					if(primes[i]){
						if(n%i==0){
							b[i]++;
							n=n/i;
							break;
						}
					}
				}
			}

			for(int i=2;i<10000000;i++){
				if(b[i]>0){
//					System.out.println(i+"^"+b[i]); //debug
					int sum=1;
					for(int j=1;j<=b[i];j++){
						sum+=(int)Math.pow(i,j);
					}
					b[i]=sum;
				}
			}

			long ans=1;
			for(int i=0;i<10000;i++){
				if(b[i]>0){
//					System.out.println("b["+i+"]="+b[i]);  //debug
					ans=ans*(long)b[i];
				}
			}
			
			ans=ans-nc;
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