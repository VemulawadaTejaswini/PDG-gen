import java.util.Scanner;

public class Main
{
	public static void main(String[]  args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		for(; n>0; n--)
		{
			String input = scanner.nextLine();
			
			String output = "";
	        for(int i=0; i<input.length(); i++)
	        {   
	            if(i <= input.length()-7)
	            {
	                if(input.substring(i, i+7).equals("Hoshino"))
	                {
	                    output += "Hoshina";
	                    i += 6;
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
}