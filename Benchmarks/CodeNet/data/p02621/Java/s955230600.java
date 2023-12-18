import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		char[] s1=s.toCharArray();
		char[] t1=t.toCharArray();
		int cnt=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=t1[i])
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
