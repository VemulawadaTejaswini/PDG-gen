import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String input = scanner.next();			
			String output = "";
			
			for(int i=0; i<input.length(); i++)
			{
				String str = input.substring(i, i+1);
				if(str.equals("@"))
				{
					int n = Integer.parseInt(input.substring(i+1, i+2));
					for(int j=0; j<n; j++)
					{
						output += input.substring(i+2, i+3);
					}
					
					i+=2;
				}
				else
				{
					output += str;
				}
			}
			System.out.println(output);
		}
	}
}