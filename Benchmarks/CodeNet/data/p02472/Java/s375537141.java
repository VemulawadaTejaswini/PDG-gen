

import java.util.Scanner;

public class Main 
{
	static void addition(String a, String b, boolean minus)
	{
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
		
		if(minus)
			System.out.println("-" + sb);		
		else
			System.out.println(sb);		
			
	}
	
	static void substraction(String a, String b, boolean minus)
	{
		StringBuilder sb = new StringBuilder("");
		
		int maxl = Math.max(a.length(), b.length());
		
		int pinjem = 0;
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
			
			int cur = p - q - (pinjem/10);
			pinjem = 0;
			if(cur < 0)
			{
				pinjem = 10;
				cur += pinjem;
			}

			sb.append(cur);
//			System.out.println("APPEND " + cur);
//			System.out.println(p + " " + q);
		}
		
		sb.reverse();
		
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) != '0')
			{
				if(i > 0)
				{
					sb.delete(0, i);
				}
				break;
			}
		}
		
		if(minus)
			System.out.println("-" + sb);		
		else
			System.out.println(sb);		
			
	}	
	
	public static void main(String[] args) 
	{
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		b = sc.next();
		
		if(a.charAt(0) == '-' && b.charAt(0) == '-')
		{
			addition(a.substring(1),b.substring(1), true);
		}
		else if(a.charAt(0) != '-' && b.charAt(0) != '-')
		{
			addition(a,b, false);
		}
		else
		{
			int abigger = 0;
			boolean ma = false;
			boolean mb = false;
			
			if(a.charAt(0) == '-')
			{
				a = a.substring(1);
				ma = true;
			}
			if(b.charAt(0) == '-')
			{
				b = b.substring(1);
				mb = true;
			}
			
			if(a.length() != b.length()) {abigger = (int) Math.signum(a.length() - b.length());}
			else{abigger = (int) Math.signum(a.compareTo(b));}
			
//			System.out.println("abigger " + abigger);
			
			if(!ma && mb)
			{
				if(abigger>0)
				{
					substraction(a,b, false);
				}
				else
				{
					substraction(b,a, true);
				}
			}
			else if(ma && !mb) //-4 + 5
			{
				if(abigger>0)
				{
					substraction(a,b, true);
				}
				else
				{
					substraction(b,a, false);
				}
			}
		}
		
	}

}

