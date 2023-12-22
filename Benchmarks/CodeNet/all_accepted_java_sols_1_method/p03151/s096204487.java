import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		long d[]=new long[n];
		long total=0;
		
		for(int i=0;i<n;++i) {
			a[i]=sc.nextLong();
		}
		for(int i=0;i<n;++i) {
			b[i]=sc.nextLong();
			d[i]=a[i]-b[i];
			total=total+d[i];
		}
		if(total<0) {
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(d);
		long credit=0L;
		int counter=0;
		int num=0;
		for(int i=0;i<n;++i) {
			if(d[i]<0) {
				++num;
				while (-d[i]>=credit) {
					++counter;
					credit=credit+d[n-counter];
				}
				credit=credit+d[i];
			}
			else {
				break;
			}
		}
		System.out.println(counter+num);
		
		
	}
}
