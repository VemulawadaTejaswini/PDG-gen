import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		for(; scanner.hasNext();)
		{
			String input = scanner.next();
			String inverse = "";
			
			for(int i=input.length(); i>0; i--)
			{
				inverse += input.substring(i-1, i);
			}
			
			if(input.equals(inverse))
			{
				count ++;
			}
		}
		
		System.out.println(count);
	}
}