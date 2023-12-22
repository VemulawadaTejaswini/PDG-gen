import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int count[] = new int[4];
		for(; scanner.hasNext();)
		{
			String input = scanner.next();
			String[] words = input.split(",");
			
			switch(words[1])
			{
				case "A":
					count[0] ++;
					break;
				case "B":
					count[1] ++;
					break;
				case "AB":
					count[2] ++;
					break;
				case "O":
					count[3] ++;
					break;
			}
		}
		
		for(int i=0; i<4; i++)
		{
			System.out.println(count[i]);
		}
	}
}