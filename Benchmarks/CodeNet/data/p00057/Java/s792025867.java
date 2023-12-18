import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int num = stdIn.nextInt();
			int ans = 1;
			for(int i = 1; i <= num; ++i)
			{
				ans += i;
			}
			System.out.println(ans);
		}
	}
}