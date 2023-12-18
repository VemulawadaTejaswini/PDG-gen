import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt(),c=0;
		int d=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			long a=in.nextLong();
			long b=in.nextLong();
			if(Math.sqrt(a*a+b*b)<=d)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}