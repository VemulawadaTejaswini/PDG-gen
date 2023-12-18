import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int index[] = new int[6];
		while(n-- != 0)
		{
			double height = stdIn.nextDouble();
			if(height < 165)
			{
				++index[0];
			}
			else if(height < 170)
			{
				++index[1];
			}
			else if(height < 175)
			{
				++index[2];
			}
			else if(height < 180)
			{
				++index[3];
			}
			else if(height < 185)
			{
				++index[4];
			}
			else
			{
				++index[5];
			}
		}
		System.out.print("1:");
		for(int i = 0; i < index[0]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("2:");
		for(int i = 0; i < index[1]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3:");
		for(int i = 0; i < index[2]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4:");
		for(int i = 0; i < index[3]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("5:");
		for(int i = 0; i < index[4]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("6:");
		for(int i = 0; i < index[5]; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}