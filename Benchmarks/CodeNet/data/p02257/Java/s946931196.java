import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] list = new int[in.nextInt()];
		for(int i = 0; i < list.length; i++ )
		{
			list[i] = in.nextInt();
		}
		System.out.println(HowManyPrime(list));
	}
	
	public static int HowManyPrime(int[] list)
	{
		int counter = 0;
		for(int i = 0; i < list.length ; i++) 
		{
			boolean prime = true;
			if(list[i] == 2 || list[i] == 3)
			{
				//prime
			}
			else if(list[i] == 1 || list[i] % 2 == 0 || list[i] % 3 == 0 )
			{
				//System.out.println("base case:" + list[i]);
				prime = false;
			}else
			{
				for(int j = 1; 6 * j <= Math.sqrt(list[i]) + 1 ; j++)
				{
					if(list[i] % ((j * 6) + 1) == 0)
					{
						//System.out.println(list[i] + " % " + ((j * 6) + 1));
						prime = false;
						break;
					}else if(list[i] % ((j * 6) - 1) == 0)
					{
						//System.out.println(list[i] + " % " + ((j * 6) - 1));
						prime = false;
						break;
					}
				}
			}
			if(prime)
			{
				//System.out.println("Prime: " + list[i]);
				counter++;
			}
		}
		return counter;
	}
}

