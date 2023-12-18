import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[]=in.next().toCharArray();
			String ans="";
			for(int i=0;i<ch.length;i+=2)
			{
				if(ch[i]=='1')
				{
					if(ch[i+1]=='T')
						ans+="a";
					else if(ch[i+1]=='L')
						ans+="i";
					else if(ch[i+1]=='U')
						ans+="u";
					else if(ch[i+1]=='R')
						ans+="e";
					else if(ch[i+1]=='D')
						ans+="o";
				}
				else if(ch[i]=='2')
				{
					if(ch[i+1]=='T')
						ans+="ka";
					else if(ch[i+1]=='L')
						ans+="ki";
					else if(ch[i+1]=='U')
						ans+="ku";
					else if(ch[i+1]=='R')
						ans+="ke";
					else if(ch[i+1]=='D')
						ans+="ko";
				}
				else if(ch[i]=='3')
				{
					if(ch[i+1]=='T')
						ans+="sa";
					else if(ch[i+1]=='L')
						ans+="si";
					else if(ch[i+1]=='U')
						ans+="su";
					else if(ch[i+1]=='R')
						ans+="se";
					else if(ch[i+1]=='D')
						ans+="so";
				}
				else if(ch[i]=='4')
				{
					if(ch[i+1]=='T')
						ans+="ta";
					else if(ch[i+1]=='L')
						ans+="ti";
					else if(ch[i+1]=='U')
						ans+="tu";
					else if(ch[i+1]=='R')
						ans+="te";
					else if(ch[i+1]=='D')
						ans+="to";
				}
				else  if(ch[i]=='5')
				{
					if(ch[i+1]=='T')
						ans+="na";
					else if(ch[i+1]=='L')
						ans+="ni";
					else if(ch[i+1]=='U')
						ans+="nu";
					else if(ch[i+1]=='R')
						ans+="ne";
					else if(ch[i+1]=='D')
						ans+="no";
				}
				else if(ch[i]=='6')
				{
					if(ch[i+1]=='T')
						ans+="ha";
					else if(ch[i+1]=='L')
						ans+="hi";
					else if(ch[i+1]=='U')
						ans+="hu";
					else if(ch[i+1]=='R')
						ans+="he";
					else if(ch[i+1]=='D')
						ans+="ho";
				}
				else if(ch[i]=='7')
				{
					if(ch[i+1]=='T')
						ans+="ma";
					else if(ch[i+1]=='L')
						ans+="mi";
					else if(ch[i+1]=='U')
						ans+="mu";
					else if(ch[i+1]=='R')
						ans+="me";
					else if(ch[i+1]=='D')
						ans+="mo";
				}
				else if(ch[i]=='8')
				{
					if(ch[i+1]=='T')
						ans+="ya";
					else if(ch[i+1]=='U')
						ans+="yu";
					else if(ch[i+1]=='D')
						ans+="yo";
				}
				else if(ch[i]=='9')
				{
					if(ch[i+1]=='T')
						ans+="ra";
					else if(ch[i+1]=='L')
						ans+="ri";
					else if(ch[i+1]=='U')
						ans+="ru";
					else if(ch[i+1]=='R')
						ans+="re";
					else if(ch[i+1]=='D')
						ans+="ro";
				}
				else if(ch[i]=='0')
				{
					if(ch[i+1]=='T')
						ans+="wa";
					else if(ch[i+1]=='U')
						ans+="nn";
					else if(ch[i+1]=='D')
						ans+="wo";
				}
			}
			System.out.println(ans);
		}
	}
}