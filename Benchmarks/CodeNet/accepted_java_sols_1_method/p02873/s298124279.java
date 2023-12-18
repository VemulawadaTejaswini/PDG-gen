import java.util.*;

class Main{
	public static void main(String[] $) throws Exception{
		Scanner s=new Scanner(System.in);
		String c='>'+s.next()+'<';
		int n=c.length()-1;

		long[]a=new long[n];
		Arrays.fill(a,-1);
		for(int i=0;i<n;++i)
			if(c.substring(i,i+2).equals("><"))
				a[i]=0;
		for(int i=1;i<n;++i)
			if(c.charAt(i)=='<')
				a[i]=a[i-1]+1;
		for(int i=n-2;i>=0;--i)
			if(c.charAt(i+1)=='>')
				a[i]=Math.max(a[i],a[i+1]+1);
		System.out.println(Arrays.stream(a).sum());
	}
}
