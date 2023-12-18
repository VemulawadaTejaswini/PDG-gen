import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			int y=in.nextInt(),m=in.nextInt(),d=in.nextInt();
			if(y<1868)
				System.out.println("pre-meiji");
			else if(y>=1868&&y<=1912)
			{
				if(y==1868)
				{
					if(m>=9)
					{
						if(m==9)
						{
							if(d>=8)
								System.out.println("meiji "+(y%1867)+" "+m+" "+d);
							else
								System.out.println("pre-meiji");
						}
						else
							System.out.println("meiji "+(y%1867)+" "+m+" "+d);
					}
					else System.out.println("pre-meiji");
				}
				else if(y==1912)
				{
					if(m<=7)
					{
						if(m==7)
						{
							if(d<=29)
								System.out.println("meiji "+(y%1867)+" "+m+" "+d);
							else
								System.out.println("taisho "+(y%1911)+" "+m+" "+d);
						}
						else System.out.println("meiji "+(y%1867)+" "+m+" "+d);
					}
					else System.out.println("taisho "+(y%1911)+" "+m+" "+d);
				}
				else
					System.out.println("meiji "+(y%1867)+" "+m+" "+d);
			}
			else if(y>1912&&y<=1926)
			{
				if(y>1912&&y<1926)
					System.out.println("taisho "+(y%1911)+" "+m+" "+d);
				else if(y==1926)
				{
					if(m<=12)
					{
						if(m==12)
						{
							if(d<=24)
								System.out.println("taisyo "+(y%1911)+" "+m+" "+d);
							else
								System.out.println("syowa "+(y%1925)+" "+m+" "+d);
						}
						else System.out.println("taisyo "+(y%1911)+" "+m+" "+d);
					}
					else System.out.println("syowa "+(y%1925)+" "+m+" "+d);
				}
			}
			else if(y>1926&&y<=1989)
			{
				if(y>1926&&y<1989)
					System.out.println("syowa "+(y%1925)+" "+m+" "+d);
				else if(y==1989)
				{
					if(m==1)
					{
						if(d<=7)
							System.out.println("syowa "+(y%1925)+" "+m+" "+d);
						else
							System.out.println("heisei "+(y%1988)+" "+m+" "+d);
					}
					else System.out.println("heise "+(y%1988)+" "+m+" "+d);
				}
			}
			else
				System.out.println("heise "+(y%1988)+" "+m+" "+d);
		}
	}
}