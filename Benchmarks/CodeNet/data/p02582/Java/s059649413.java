import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='R')
				c++;
			else
			{
				a.add(c);
				c=0;
			}
		}
		a.add(c);
	                  System.out.println(Collections.max(a));

		
	}
}