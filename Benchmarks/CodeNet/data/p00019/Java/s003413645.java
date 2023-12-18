import java.util.*;

class Factorial
{
	public static void main(String args[])
	{		
		int n, i, prod=1;
		Scanner s= new Scanner(System.in);

		n = s.nextInt();
		for(i=n;i>=1;i--)
		{
			prod=prod*i;
		}
		System.out.print(n);
	}
}
    