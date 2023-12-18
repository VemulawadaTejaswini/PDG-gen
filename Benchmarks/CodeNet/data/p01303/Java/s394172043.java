import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		while(a-- != 0)
		{
			int X = stdIn.nextInt();
			int Y = stdIn.nextInt();
			int W = stdIn.nextInt();
			int H = stdIn.nextInt();
			int N = stdIn.nextInt();
			int count = 0;
			for(int i = 0; i < N; ++i)
			{
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				if((X <= x && x <= X + W) && (Y <= y && y <= Y + H))
				{
					++count;
				}
			}
			System.out.println(count);
		}
	}
}