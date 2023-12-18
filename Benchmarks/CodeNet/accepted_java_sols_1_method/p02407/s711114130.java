import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String totalStr = input.readLine();
		
		int total = Integer.parseInt(totalStr);
		
		String[] numbers = input.readLine().split(" ");
		
		for(int reverse = total; reverse > 0; reverse--)
		{
			System.out.print(numbers[reverse - 1]);
			
			if(reverse != 1)
			{
				System.out.print(" ");
			}
			
			else
			{
				System.out.println();
			}
		}
	}
}

