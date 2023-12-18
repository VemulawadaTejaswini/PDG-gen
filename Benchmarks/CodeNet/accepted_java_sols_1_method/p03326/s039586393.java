import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long x[] = new long[N];
		long y[] = new long[N];
		long z[] = new long[N];

		for(int n=0;n<N;n++){
			x[n] = sc.nextLong();
			y[n] = sc.nextLong();
			z[n] = sc.nextLong();
		}

		long max = 0;
		long v[] = new long[N];

		for(int a=0;a<2;a++){
			for(int b=0;b<2;b++){
				for(int c=0;c<2;c++){

					for(int n=0;n<N;n++){
						v[n] = (long)Math.pow((-1),a)*x[n] + (long)Math.pow((-1),b)*y[n] + (long)Math.pow((-1),c)*z[n];
					}

					Arrays.sort(v);
					long val = 0;
					for(int m=0;m<M;m++){
						val += v[N-m-1];
					}
					if(max < val){
						max = val;	
					} 

				}
			}			
		}
		

		System.out.println(max);

	}
}