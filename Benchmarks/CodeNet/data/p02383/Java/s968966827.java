import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] A = new int[7];
		for(int i = 0; i < 6; i++)
			A[i] = input.nextInt();
		String S = input.next();
		for( int i = 0; i < S.length(); i++)
		{
			dice(S.charAt(i), A);
		}	
			
		System.out.println(A[0]);
	}

	private static void dice(char roll, int a[])
	{
		int t;
		if( roll == 'E')
		{
			t = a[0];
			a[0] = a[3];
			a[3] = a[5];
			a[5] = a[2];
			a[2] = t;
		}
		else if( roll == 'W')
		{
			t = a[0];
			a[0] = a[2];
			a[2] = a[5];
			a[5] = a[3];
			a[3] = t;
		}
		else if(roll == 'N')
		{
			t = a[0];
			a[0] = a[1];
			a[1] = a[5];
			a[5] = a[4];
			a[4] = t;
		}
		else if(roll == 'S')
		{
			t = a[0];
			a[0] = a[4];
			a[4] = a[5];
			a[5] = a[1];
			a[1] = t;
		}
	}
}