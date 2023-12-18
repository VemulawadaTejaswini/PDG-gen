import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int x=in.nextInt();
			int y=in.nextInt();
			if((x|y)==0)
				return;
			int c=y-x;
			System.out.println(c%500/100+" "+c%1000/500+" "+c/1000);
		}
	}
}