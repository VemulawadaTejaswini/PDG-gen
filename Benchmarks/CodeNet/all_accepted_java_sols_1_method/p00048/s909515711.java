import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			float w = scanner.nextFloat();
			String rank;
			
			if(w <= 48)
				rank = "light fly";
			else if(48<w && w<=51)
				rank = "fly";
			else if(51<w && w<=54)
				rank = "bantam";
			else if(54<w && w<=57)
				rank = "feather";
			else if(57<w && w<=60)
				rank = "light";
			else if(60<w && w<=64)
				rank = "light welter";
			else if(64<w && w<=69)
				rank = "welter";
			else if(69<w && w<=75)
				rank = "light middle";
			else if(75<w && w<=81)
				rank = "middle";
			else if(81<w && w<=91)
				rank = "light heavy";
			else 
				rank = "heavy";
			
			System.out.println(rank);
		}
	}
}