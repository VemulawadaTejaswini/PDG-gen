import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int sum = 100000;
		for(int i = 0; i < n; ++i)
		{
			sum *= 1.05;
			int remainder = sum % 1000;
			if(remainder > 0)
			{
				sum = sum - remainder + 1000;
			}
		}
		System.out.println(sum);
	}
}