import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{

		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int[] number = new int[n];
		for(int i=0; i<n; i++)
		{
			number[i]=scan.nextInt();
		}
		for(int i=0; i<n-1; i++)
		{
			if(number[i]>number[i+1])
			{
				int temp = number[i];
				number[i] = number[i+1];
				number[i+1] = temp;
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(number[i]);
			if(i!=n-1)
				System.out.print(" ");
		}
	}
}