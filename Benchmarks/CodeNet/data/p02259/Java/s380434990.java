import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] A = new int[101];
		int n, i, j, key;
		n = input.nextInt();
		for(i = 0; i <n; i++)
		{
			A[i]=input.nextInt();
		}
		bubble(A, n);
	}

	public static void bubble(int A[], int n)
	{
		int count = 0, t;
		for(int i = 0; i < n; i++)
		{
			for(int j = n-1; j>=i+1; j--)
			{
				if(A[j] < A[j-1])
				{
					t = A[j];
					A[j] = A[j-1];
					A[j-1] = t;
					count++;
				}
			}
		}
		trace(A, n);
		System.out.println(count);
	}

	public static void trace(int A[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			if(i > 0)System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
	}
}