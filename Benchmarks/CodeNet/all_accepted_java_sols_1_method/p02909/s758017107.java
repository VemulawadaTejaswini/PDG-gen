import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner	sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";

		if(input.equals("Sunny"))
		{
			output = "Cloudy";
		}
		else if(input.equals("Cloudy"))
		{
			output = "Rainy";
		}
		else if(input.equals("Rainy"))
		{
			output = "Sunny";
		}

		System.out.print(output);
	}
}