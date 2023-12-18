import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			String temp = stdIn.next();
			if(temp.equals("-"))
			{
				break;
			}
			StringBuffer str = new StringBuffer(temp);
			int m = stdIn.nextInt();
			for(int i = 0; i < m; ++i)
			{
				int h = stdIn.nextInt();
				StringBuffer strBuf = new StringBuffer(str.toString());
				for(int j = h; j < str.length(); ++j)
				{
					strBuf.setCharAt(j - h, str.charAt(j));
				}
				for(int j = 0; j < h; ++j)
				{
					strBuf.setCharAt(str.length() - h + j, str.charAt(j));
				}
				str = strBuf;
			}
			System.out.println(str);
		}
	}
}