import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int t = stdIn.nextInt();
		while(t-- != 0)
		{
			int n = stdIn.nextInt();
			int pos = stdIn.nextInt();
			int up = 0, down = 0;
			for(int i = 1; i < n; ++i)
			{
				int a = stdIn.nextInt();
				if(pos > a && pos - a > down)
				{
					down = pos - a;
				}
				else if(pos < a && a - pos > up)
				{
					up = a - pos;
				}
				pos = a;
			}
			System.out.println(up + " " + down);
		}
	}
}