import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		boolean a[] = new boolean [31];
		Arrays.fill(a, false);

		for(int i=0; i<28; i++)
		{
			int n = sc.nextInt();
			a[n] = true;
		}
		for(int i=1; i<=30; i++)
			if(!a[i])
				System.out.println(i);

	}

}