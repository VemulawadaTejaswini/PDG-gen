import java.util.Scanner;
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
				String res = "";

				int now;
				while(true)
				{
					now=Integer.valueOf(str.charAt(i))-'0';
					int cnt=1;
					while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
					{
						cnt++;
						i++;
					}
					if(i!=str.length()-1)
					{
						res+=cnt+"";
						res+=now;
					}
					if(i==str.length()-1)
					{
						res+=cnt+"";
						res+=now;
					}
					if(i==str.length()-1)
						break;
					i++;
				}
				i=0;
				str=res;
			}
			System.out.println(str);
		}
	}
}