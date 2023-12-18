import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int k = n / 4;
			int sum = 0;
			for(int i = 0; i < k; ++i)
			{
				int a = stdIn.nextInt();
				sum += a;
			}
			System.out.println(sum);
		}
	}
}