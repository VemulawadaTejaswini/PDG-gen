import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long temp = 1;

		for(long i = 2; i <= n; i++)
		{
			temp *= i;
			temp = temp % 1000000007;
		}

		System.out.println(temp);
  	}
}