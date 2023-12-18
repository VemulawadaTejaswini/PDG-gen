import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=1000000+5;
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		int ans=0,M=0;
		for(int i=1;i<=n;i++)
		{
			int x=sc.nextInt();
			M=Math.max(M, x);
			ans+=x;
		}
		M/=2;
		System.out.println((ans-M));
	}
}