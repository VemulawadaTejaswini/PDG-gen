import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];

		for(int i=0; i<5; i++)
		{
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);

		for(int i=0; i<5; i++)
		{
			System.out.print(a[5-i-1]);
			if(i!=4)
				System.out.print(" ");
		}
		System.out.println();
	}

}