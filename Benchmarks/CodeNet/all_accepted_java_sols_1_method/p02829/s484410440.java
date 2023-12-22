import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int[] arr = {1,2,3};
		
		for(int i : arr)
		{
			if(i == a || i == b)
			{
				
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
