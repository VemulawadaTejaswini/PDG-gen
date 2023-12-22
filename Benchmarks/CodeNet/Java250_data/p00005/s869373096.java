import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext())
	{
		long a = cin.nextInt();
		long b = cin.nextInt();
		
		long m = a;
		long n = b;
		long p = m;
		while(n != 0){p = n; n = m%n; m = p;}
		
		
		System.out.println(m+" "+a*b/m);
	}

    }
}