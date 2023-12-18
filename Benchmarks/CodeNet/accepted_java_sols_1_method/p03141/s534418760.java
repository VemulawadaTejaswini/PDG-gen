import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		long taka[]=new long[n];
		long total=0L;
	
		for(int i=0;i<n;++i) {
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
			taka[i]=(a[i]+b[i])*1000000 + i;
		}
		Arrays.sort(taka);
		if(n%2==1) {
		for(int i=0;i<n;++i) {

			if (i%2==0)total=total+a[(int)(taka[i]%1000000)];
			else total=total-b[(int)(taka[i]%1000000)];
		}
		}
		else {
			for(int i=0;i<n;++i) {

				if (i%2==1)total=total+a[(int)(taka[i]%1000000)];
				else total=total-b[(int)(taka[i]%1000000)];
			}
		}
		System.out.println(total);
	}
}
