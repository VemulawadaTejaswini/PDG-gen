import java.util.Scanner;



public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{	
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			
			int sum = m + f;
			String result = "";
			if(m==-1 && f==-1 && r==-1)
			{
				break;
			}
			else if(m==-1 || f==-1)
			{
				result = "F";
			}
			else if(sum < 30)
			{
				result = "F";
			}
			else if(30<=sum && sum < 50)
			{
				if(r >= 50)
				{
					result = "C";
				}
				else
				{
					result = "D";
				}
			}
			else if(50<=sum && sum < 65)
			{
				result = "C";
			}
			else if(65<=sum && sum < 80)
			{
				result = "B";
			}
			else {
				result = "A";
			}
			
			System.out.println(result);
		}
	}
}