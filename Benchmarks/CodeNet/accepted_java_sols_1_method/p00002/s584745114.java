
import java.util.Scanner;
import java.util.ArrayList;
class Main
{
	public static void main(String[] av)
	{
		Scanner sc  = new Scanner( System.in );
		ArrayList<Integer> al = new ArrayList<Integer>();

		while( sc.hasNextInt() )
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			int digit = String.valueOf(sum).length();	
			al.add( digit );
		}
		for ( Integer num : al )
		{
			System.out.println(num );
		}
	}
}
		