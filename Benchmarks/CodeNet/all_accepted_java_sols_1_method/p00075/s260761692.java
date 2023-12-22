import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String[] input = scanner.next().split(",");
			
			float weight = Float.parseFloat(input[1]);
			float height = Float.parseFloat(input[2]);
			
			float bmi = weight/(height*height);
			if(bmi >= 25)
			{
				System.out.println(Integer.parseInt(input[0]));
			}
		}
	}
}