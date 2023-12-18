import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a==0 && b==0)
			{
				break;
			}
			
			List<Integer> list = new ArrayList<>();
			for(int i=a; i<=b; i++)
			{
				if((i%4==0 && i%100>0) || i%400==0)
				{
					list.add(i);
				}
			}
			
			if(list.size() > 0)
			{
				for(int y : list)
				{
					System.out.println(y);
				}
			}
			else
			{
				System.out.println("NA");
			}
			System.out.println("");
		}
	}
}