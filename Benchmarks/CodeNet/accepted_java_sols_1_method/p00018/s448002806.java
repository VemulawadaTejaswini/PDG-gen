import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		int[] a = new int[5];
		
		while(cin.hasNext())
		{
			for(int i=0; i<5; i++)
				a[i] = cin.nextInt();
			
			Arrays.sort(a);
			
			for(int i=4; i>0; i--)
				System.out.print(a[i]+" ");
				System.out.println(a[0]);
			}
	}
}