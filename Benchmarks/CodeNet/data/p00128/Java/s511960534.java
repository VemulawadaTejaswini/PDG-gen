import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int j=0;
		while(in.hasNext())
		{
			String d5="";
			String d4="";
			String d3="";
			String d2="";
			String d1="";
			char ch[]=in.next().toCharArray();
			int n=ch.length;
			if(n==1)
			{
				d5=sol('0');
				d4=sol('0');
				d3=sol('0');
				d2=sol('0');
				d1=sol(ch[0]);
			}
			else if(n==2)
			{
				d5=sol('0');
				d4=sol('0');
				d3=sol('0');
				d2=sol(ch[0]);
				d1=sol(ch[1]);
			}
			else if(n==3)
			{
				d5=sol('0');
				d4=sol('0');
				d3=sol(ch[0]);
				d2=sol(ch[1]);
				d1=sol(ch[2]);
			}
			else if(n==4)
			{
				d5=sol('0');
				d4=sol(ch[0]);
				d3=sol(ch[1]);
				d2=sol(ch[2]);
				d1=sol(ch[3]);
			}
			else if(n==5)
			{
				d5=sol(ch[0]);
				d4=sol(ch[1]);
				d3=sol(ch[2]);
				d2=sol(ch[3]);
				d1=sol(ch[4]);
			}
			if(j==1)
				System.out.println();
			for(int i=0;i<8;i++)
				System.out.println(d5.charAt(i)+""+d4.charAt(i)+""+d3.charAt(i)+""+d2.charAt(i)+""+d1.charAt(i));
			j=1;
		}
	}
	public static String sol(char c)
	{
		if(c=='1')
			return "* =* ***";
		else if(c=='2')
			return "* =** **";
		else if(c=='3')
			return "* =*** *";
		else if(c=='4')
			return "* =**** ";
		else if(c=='5')
			return " *= ****";
		else if(c=='6')
			return " *=* ***";
		else if(c=='7')
			return " *=** **";
		else if(c=='8')
			return " *=*** *";
		else if(c=='9')
			return " *=**** ";
		else 
			return "* = ****";
	}
}