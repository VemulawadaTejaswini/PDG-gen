import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] apple = {"apple", "APPLE"};
		String[] peach = {"peach", "PEACH"};
		
		String input = scanner.nextLine();
		
		String output = "";
		for(int i=0; i<input.length(); i++)
		{	
			if(i <= input.length()-5)
			{
				if(input.substring(i, i+5).equals("apple"))
				{
					output += "peach";
					i += 4;
				}
				else if(input.substring(i, i+5).equals("peach"))
				{
					output += "apple";
					i += 4;
				}
				else
				{
					output += input.substring(i, i+1);
				}
			}
			else
			{
				output += input.substring(i, i+1);
			}
		}
		
		System.out.println(output);
	}
}