import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int secret_num = 0;
		for(; scanner.hasNext();)
		{
			String input = scanner.next();
			
			for(int i=0; i<input.length(); i++)
			{
				char c = input.charAt(i);
				int num = 0;
				for(;('0'<=c && c<='9');)
				{
					num = 10*num + Integer.parseInt(input.substring(i, i+1));
					
					if(++i < input.length())
					{
						c=input.charAt(i);
					}
					else{
						break;
					}
					
				}				
				secret_num += num;
			}
		}
		
		System.out.println(secret_num);
	}
}