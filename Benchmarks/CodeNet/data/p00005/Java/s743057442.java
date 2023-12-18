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
		
		int i = 1;
		while(i != 0)
		{
			if(i%a ==0 && i%b==0){break;}
			i++;
		}
		
		System.out.println(m+" "+i);
	}

    }
}