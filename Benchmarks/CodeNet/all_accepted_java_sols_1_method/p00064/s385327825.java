import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int c =0;
		String t = "0";
		while(in.hasNext())
		{
			char h[]=in.nextLine().toCharArray();
			for(int i=0; i<h.length; i++)
			{
				while(i<h.length&&(Character.isDigit(h[i])))
				{
					t+=h[i];
					i++;
				}
				c+=Integer.valueOf(t);
				t="0";
			}
		}
		System.out.println(c);
	}
}