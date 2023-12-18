import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; ++i)
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			a *= a;
			b *= b;
			c *= c;
			if(a + b == c || a + c == b || b + c == a)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}