import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();

		long r=0;
		for(long i=1;i*(i+1)<n;++i) {
			if(n%i==0) {
				long v=i<n/i?n/i-1:i;
				r+=v;
				System.err.println(v);
			}
		}
		System.out.println(r);
	}
}