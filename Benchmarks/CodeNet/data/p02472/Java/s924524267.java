

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		b = sc.next();
		
		StringBuilder sb = new StringBuilder("");
		
		int maxl = Math.max(a.length(), b.length());
		
		int remainder = 0;
		for(int i = 0; i < maxl; i++)
		{
			int p = 0;
			int q = 0;
			
			if(a.length() >= i+1)
			{
				p = a.charAt(a.length()-1-i)-'0';
			}
			
			if(b.length() >= i+1)
			{
				q = b.charAt(b.length()-1-i)-'0';
			}
			
			int cur = (p+q+remainder)%10 ;
			remainder = (p+q+remainder)/10;
			
			sb.append(cur);
			
//			System.out.println(p + " " + q);
		}
		
		if(remainder > 0)sb.append(remainder);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}

