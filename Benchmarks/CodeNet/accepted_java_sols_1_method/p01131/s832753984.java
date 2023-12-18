import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			char ch[]=in.next().toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int c=0;
				if(ch[i]=='1')
				{
					while(ch[i]=='1')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{

						if(c%5==1)
							System.out.print(".");
						else if(c%5==2)
							System.out.print(",");
						else	if(c%5==3)
							System.out.print("!");
						else	if(c%5==4)
							System.out.print("?");
						else	if(c%5==0)
							System.out.print(" ");
					}
				}
				else if(ch[i]=='2')
				{
					while(ch[i]=='2')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("a");
						else if(c%3==2)
							System.out.print("b");
						else	if(c%3==0)
							System.out.print("c");
					}
				}
				else if(ch[i]=='3')
				{
					while(ch[i]=='3')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("d");
						else if(c%3==2)
							System.out.print("e");
						else	if(c%3==0)
							System.out.print("f");
					}
				}
				else if(ch[i]=='4')
				{
					while(ch[i]=='4')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("g");
						else if(c%3==2)
							System.out.print("h");
						else	if(c%3==0)
							System.out.print("i");
					}
				}
				else if(ch[i]=='5')
				{
					while(ch[i]=='5')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("j");
						else if(c%3==2)
							System.out.print("k");
						else	if(c%3==0)
							System.out.print("l");
					}
				}
				else if(ch[i]=='6')
				{
					while(ch[i]=='6')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("m");
						else if(c%3==2)
							System.out.print("n");
						else	if(c%3==0)
							System.out.print("o");
					}
				}
				else if(ch[i]=='7')
				{
					while(ch[i]=='7')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%4==1)
							System.out.print("p");
						else if(c%4==2)
							System.out.print("q");
						else	if(c%4==3)
							System.out.print("r");
						else	if(c%4==0)
							System.out.print("s");

					}
				}
				else if(ch[i]=='8')
				{
					while(ch[i]=='8')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%3==1)
							System.out.print("t");
						else if(c%3==2)
							System.out.print("u");
						else	if(c%3==0)
							System.out.print("v");
					}
				}
				else if(ch[i]=='9')
				{
					while(ch[i]=='9')
					{
						c++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c%4==1)
							System.out.print("w");
						else if(c%4==2)
							System.out.print("x");
						else	if(c%4==3)
							System.out.print("y");
						else	if(c%4==0)
							System.out.print("z");
					}
				}
			}
			System.out.println();
		}
	}
}