import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long r=Long.MAX_VALUE;
		for(long i=1;i*i<=n;++i) {
			if(n%i==0)
				r=Math.min(r,i+n/i-2);
		}
		System.out.println(r);
	}
}
