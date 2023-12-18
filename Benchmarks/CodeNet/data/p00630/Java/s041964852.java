import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			char ch[]=in.next().toCharArray();
			String ans="";
			String st=in.next();
			if(st.equals("X"))
				return;
			else if(st.equals("U"))
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]=='_')
					{
						ans+=(ch[i+1]+"").toUpperCase();
						i++;
					}
					else
					{
						String tmp=ch[i]+"";
						if(i==0)
							ans+=tmp.toUpperCase();
						else 
							ans+=tmp;
					}
				}
			else if(st.equals("L"))
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]=='_')
					{
						ans+=(ch[i+1]+"").toUpperCase();
						i++;
					}
					else
					{
						String tmp=ch[i]+"";
						if(i==0)
							ans+=tmp.toLowerCase();
						else 
							ans+=tmp;
					}
				}
			else if(st.equals("D"))
				for(int i=0;i<ch.length;i++)
				{
					if(i!=0&&Character.isUpperCase(ch[i]))
					{
						ans+="_";
						ans+=(ch[i]+"").toLowerCase();
					}
					else
						ans+=(ch[i]+"").toLowerCase();
				}
			System.out.println(ans);
		}
	}
}