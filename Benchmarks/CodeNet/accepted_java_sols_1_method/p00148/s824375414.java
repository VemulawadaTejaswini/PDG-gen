import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			System.out.print("3C");
			int ans = n % 39;
			if(ans < 10)
			{
				if(ans == 0)
				{
					System.out.println("39");
				}
				else
				{
					System.out.println("0" + ans);
				}
			}
			else
			{
				System.out.println(ans);
			}
		}
	}
}