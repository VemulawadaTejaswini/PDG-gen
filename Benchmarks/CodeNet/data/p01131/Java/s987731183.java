import java.util.Scanner;
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
				int c1=0;
				int c2=0;
				int c3=0;
				int c4=0;
				int c5=0;
				int c6=0;
				int c7=0;
				int c8=0;
				int c9=0;
				if(ch[i]=='1')
				{
					while(ch[i]=='1')
					{
						c1++;
						i++;
					}
					if(ch[i]=='0')
					{

						if(c1%5==1)
							System.out.print(".");
						else if(c1%5==2)
							System.out.print(",");
						else	if(c1%5==3)
							System.out.print("!");
						else	if(c1%5==4)
							System.out.print("?");
						else	if(c1%5==0)
							System.out.print(" ");
					}
				}
				else if(ch[i]=='2')
				{
					while(ch[i]=='2')
					{
						c2++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c2%3==1)
							System.out.print("a");
						else if(c2%3==2)
							System.out.print("b");
						else	if(c2%3==0)
							System.out.print("c");
					}
				}
				else if(ch[i]=='3')
				{
					while(ch[i]=='3')
					{
						c3++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c3%3==1)
							System.out.print("d");
						else if(c3%3==2)
							System.out.print("e");
						else	if(c3%3==0)
							System.out.print("f");
					}
				}
				else if(ch[i]=='4')
				{
					while(ch[i]=='4')
					{
						c4++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c4%3==1)
							System.out.print("g");
						else if(c4%3==2)
							System.out.print("h");
						else	if(c4%3==0)
							System.out.print("i");
					}
				}
				else if(ch[i]=='5')
				{
					while(ch[i]=='5')
					{
						c5++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c5%3==1)
							System.out.print("j");
						else if(c5%3==2)
							System.out.print("k");
						else	if(c5%3==0)
							System.out.print("l");
					}
				}
				else if(ch[i]=='6')
				{
					while(ch[i]=='6')
					{
						c6++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c6%3==1)
							System.out.print("m");
						else if(c6%3==2)
							System.out.print("n");
						else	if(c6%3==0)
							System.out.print("o");
					}
				}
				else if(ch[i]=='7')
				{
					while(ch[i]=='7')
					{
						c7++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c7%4==1)
							System.out.print("p");
						else if(c7%4==2)
							System.out.print("q");
						else	if(c7%4==3)
							System.out.print("r");
						else	if(c7%4==0)
							System.out.print("s");

					}
				}
				else if(ch[i]=='8')
				{
					while(ch[i]=='8')
					{
						c8++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c8%3==1)
							System.out.print("t");
						else if(c8%3==2)
							System.out.print("u");
						else	if(c8%3==0)
							System.out.print("v");
					}
				}
				else if(ch[i]=='9')
				{
					while(ch[i]=='9')
					{
						c9++;
						i++;
					}
					if(ch[i]=='0')
					{
						if(c9%4==1)
							System.out.print("w");
						else if(c9%4==2)
							System.out.print("x");
						else	if(c9%4==0)
							System.out.print("y");
						else	if(c9%4==0)
							System.out.print("z");

					}
				}
			}
			System.out.println();
		}
	}
}