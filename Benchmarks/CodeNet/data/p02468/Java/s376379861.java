import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long i=sc.nextLong();
		long j=sc.nextLong();
		System.out.println(npmodm_solve(i,j,1000000007));
	}
	public static long npmodm_solve(long n,long p,long m) {		//n^p mod m

		long[] amari=new long[64];

		amari[0]=n%m;
		for(int i=0; i<62; i++) {
			amari[i+1]=amari[i]*amari[i]%m;
		}
		long tmp=p;
		int counter=0;
		long ans=1;
		while(tmp>0) {
			if(tmp%2==1) {
				ans=ans*amari[counter]%m;
				tmp/=2;
				counter++;
			}
			else {
				tmp/=2;
				counter++;
			}
		}
		 return ans;
	}
}
