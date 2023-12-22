import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		long[]a=new long[n+1];
		for(int i=1;i<=n;++i)
			a[i]=s.nextInt();
		Arrays.parallelPrefix(a,Long::sum);
		Map<Long,Long>m=new HashMap<>();
		for(long i:a)
			m.merge(i%k,1L,Long::sum);
		System.out.println(m.values().stream().mapToLong(i->i*(i-1)/2).sum());
	}
}