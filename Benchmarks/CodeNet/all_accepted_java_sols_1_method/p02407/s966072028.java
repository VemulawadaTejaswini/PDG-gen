import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = input.nextInt();
		for(int i = n-1; i >= 0; i--)
		{
			if(i == 0)
				System.out.println(arr[i]);
			else 
				System.out.print(arr[i] + " ");
		}
	}
}