import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		String p = scanner.next();
		
		String out = "No";
		for(int i=0; i<s.length(); i++)
		{
			String str = "";
			for(int j=0; j<p.length(); j++)
			{
				int k = i+j;
				if(k >= s.length())
				{
					k -= s.length(); 
				}
				str += s.substring(k, k+1);
			}
			
			if(p.equals(str))
			{
				out = "Yes";
				break;
			}
		}
		System.out.println(out);
	}
}