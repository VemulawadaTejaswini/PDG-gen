import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int ans = 0;
		while (stdIn.hasNext())
		{
			String s = stdIn.next();
			StringBuffer sBuf = new StringBuffer(s);
			sBuf.reverse();
			if(s.equals(sBuf.toString()))
			{
				++ans;
			}
		}
		System.out.println(ans);
	}
}