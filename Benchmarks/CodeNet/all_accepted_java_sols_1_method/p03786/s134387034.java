import java.util.*;

public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),b=1,i=0;
		long[]a=new long[n+1];
		while(++i<=n)a[i]=s.nextInt();
		Arrays.sort(a);
		Arrays.parallelPrefix(a,Long::sum);
		while(--n>0&&a[n+1]-a[n]<=a[n]*2)b++;
		System.out.println(b);
	}
}