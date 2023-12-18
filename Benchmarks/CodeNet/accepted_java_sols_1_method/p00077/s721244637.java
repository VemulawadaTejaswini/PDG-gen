import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			char[] ch=in.next().toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!='@')
					System.out.print(ch[i]);
				else if(ch[i++]=='@')
				{	
					int x=Integer.valueOf(ch[i++]+"");
					while(x-->0)
						System.out.print(ch[i]);
				}
			}
			System.out.println();
		}
	}

}