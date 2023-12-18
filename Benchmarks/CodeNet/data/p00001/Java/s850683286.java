import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] heights = new int[10];
		int temp;
		
		for(int i = 0; i < 10; i++)
		{
			heights[i] = Integer.parseInt(scan.nextLine());
		}
		
		for(int i = 0; i < heights.length; i++)
		{
			for(int k = 1; k < heights.length - i; k++)
			{
				if( heights[k-1] > heights[k])
				{
					temp = heights[k];
					heights[k] = heights[k-1];
					heights[k-1] = temp;
				}
			}
		}
		for(int i = heights.length - 1; i > heights.length - 4; i--)
		{
			System.out.println(heights[i]);
		}
		scan.close();
	}
}