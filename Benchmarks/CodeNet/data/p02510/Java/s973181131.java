import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String s = sc.next();
			if(s.equals("-"))
			{
				break;
			}
			int m = sc.nextInt();
			for(int i = 0; i < m; ++i)
			{
				int h = sc.nextInt();
				StringBuilder sNext = new StringBuilder();
				for(int j = h; j < s.length(); ++j)
				{
					sNext.append(s.charAt(j));
				}
				for(int j = 0; j < h; ++j)
				{
					sNext.append(s.charAt(j));
				}
				s = sNext.toString();
			}
			System.out.println(s);
		}
	}
}