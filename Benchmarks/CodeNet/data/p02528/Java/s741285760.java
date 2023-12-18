import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n, tmp;
			n = sc.nextInt();
			int nums[] = new int[n];
			for(int i = 0; i < n; i++)
			{
				nums[i] = sc.nextInt();
			}
			
			for(int i = 0; i < n; i++)
			{
				for(int j = i + 1; j < n; j++)
				{
					if(nums[i] > nums[j]);
					{
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
					}
				}
				
			}
			
			System.out.print(nums[0]);
			for(int i = 1; i < n; i++)
			{
				System.out.print(" " + nums[i]);
			}
			System.out.print("\n");
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}