import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		ArrayList<Integer> list = new ArrayList<> (number);
		for(int i = 0; i < number; i++)
		{
			list.add(in.nextInt());
		}
		int max = list.get(0);
		int sum = 0;
		for(int i = 1; i < list.size(); i++)
		{
			int temp = list.get(i);
			sum += temp;
			if(temp > max)
			{
				sum += max;
				sum -= temp;
				max = temp;
			}
		}
//		System.out.println("max is " + max);
//		System.out.println("sum is " + sum);
		if(max < sum)
			System.out.println("Yes");
		else
			System.out.println("No");
	
	}

}