import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int t = stdIn.nextInt();
			if(t == 0)
			{
				break;
			}
			int n = stdIn.nextInt();
			int sum = 0;
			while(n-- != 0)
			{
				int s = stdIn.nextInt();
				int f = stdIn.nextInt();
				sum += f - s;
			}
			if(sum >= t)
			{
				System.out.println("OK");
			}
			else
			{
				System.out.println(t - sum);
			}
		}
	}
}