import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int p = scanner.nextInt();
		
		for(int i=0; i<p; i++)
		{		
			String in = scanner.next();
			int n = scanner.nextInt();
			int m= scanner.nextInt();
			String s = "";
			
			switch (in)
			{
				case "print":
					System.out.println(str.substring(n, m+1));
					break;
				case "reverse":
					s = str.substring(n, m+1);
					String t="";
					for(int j=s.length(); j>0; j--)
					{
						t += s.substring(j-1, j);
					}
					
					s = "";
					for(int j=0; j<str.length(); j++)
					{
						if(n<=j && j<=m)
						{
							 s += t.substring(j-n, j-n+1);
						}
						else
						{
							s += str.substring(j, j+1);
						}
					}
					str = s;
					break;
				case "replace":
					s = "";
					String rep = scanner.next();
					for(int j=0; j<str.length(); j++)
					{
						if(n<=j && j<=m)
						{
							 s += rep.substring(j-n, j-n+1);
						}
						else
						{
							s += str.substring(j, j+1);
						}
					}
					str = s;
					break;
			}
		}
	}
}