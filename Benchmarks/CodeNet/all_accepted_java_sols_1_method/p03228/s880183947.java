import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		int d = 0;
		while(c-- != 0)
		{
		    if(d == 0)
		    {
		    if(a % 2 != 0)
		    {
		        a--;
		    }
		    a /= 2;
		    b += a;
		    d = 1;
		    }
		    else if(d == 1)
		    {
		        if(b % 2 != 0)
		        {
		            b--;
		        }
		        b /= 2;
		        a += b;
		        d = 0;
		    }
		}
		System.out.print(a + " " + b);
	}
}