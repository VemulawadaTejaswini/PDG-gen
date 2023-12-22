import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextLong();
		
		long k=1;
		for(long i=1; i*i<=N; i++) {
			k=i;
		}
		k++;
		
		int a=0,b=0;
		long xa=0,xb=0;
		for(long j=k; k>=1; k--) {
			if(N%k==0) {
				xa=k;
				xb=N/k;
				while(xa>0) {
					a++;
					xa/=10;
				}
				
				while(xb>0) {
					b++;
					xb/=10;
				}
				System.out.println(Math.max(a, b));
				return;
			}
		}
	}
}