import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			String str=in.next();
			int i=0;
			while(n-->0)
			{
				int now;
				StringBuilder sb= new StringBuilder();
				for(;;)
				{
					now=str.charAt(i)-'0';
					int cnt=1;
					while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
					{
						cnt++;
						i++;
					}
					sb.append(cnt).append(now);
					if(i==str.length()-1)
						break;
					i++;
				}
				i=0;
				str=sb.toString();
			}
			System.out.println(str);
		}
	}
}