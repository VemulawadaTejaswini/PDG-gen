import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			String a = scanner.next();
			String b = scanner.next();
			String c = "";
			
			int s = 0;
			for(int j=0; j<a.length() || j<b.length(); j++)
			{
				int a0 = 0, b0 = 0;
				if(j < a.length())
					a0 = Integer.parseInt(a.substring(a.length()-j-1, a.length()-j));
				if(j < b.length())
					b0 = Integer.parseInt(b.substring(b.length()-j-1, b.length()-j));
				
				int m = a0 + b0 + s;
				c = (m%10) + c;
				if(m >= 10)
				{
					s = 1;
				}
				else {
					s = 0;
				}
			}
			c = (s>0?"1":"") + c;
			System.out.println((c.length()>80) ? "overflow" : c);
		}
	}
}