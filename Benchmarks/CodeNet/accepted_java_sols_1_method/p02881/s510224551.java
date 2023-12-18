import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		long min=Long.MAX_VALUE;
		for(long i=2;i<=Math.sqrt(n);i++)
		{
			
			if(n%i==0)
			{
				min=Math.min(min,(i-1)+((n/i)-1));
			}
		}
		if(min==Long.MAX_VALUE)
		{
				System.out.println(n-1);
			return;
		}
		System.out.println(min);
	}
}