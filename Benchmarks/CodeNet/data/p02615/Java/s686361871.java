import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int number = console.nextInt();
		int a[] = new int[number];

		for(int i = 0; i < number; i ++)
		{
			a[i] = console.nextInt();
		}

		// sort
		for(int j = 0; j < number; j ++)
		{
			int smallest = a[j];
			int s_index = j;
			
			for(int k = j + 1; k < number; k ++)
			{
				if(smallest > a[k])
				{
					smallest = a[k];
					s_index = k;
				}
			}
			int temp = a[j];
			a[j] = smallest;
			a[s_index] = temp;
		}

		//list is in order.
		int answer = 0;
		for(int b = 1; b < number; b ++)
		{
			answer += a[b];
		}

		System.out.print(answer);

	}
}