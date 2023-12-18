import java.util.Scanner;

class Main
{
    public static int Partition(int[]A, int p, int r)
    {
	int x = A[r];
	int i = p - 1;

	for(int j = p; j < r; j++)
	    {
		if(A[j] <= x)
		    {
			i++;
			int a = A[j];
			A[j] = A[i];
			A[i] = a;
		    }
	
	    }	
	int b = A[r];
	A[r] = A[i + 1];
	A[i + 1] = b;
	
	return i + 1;
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();

	int[] A = new int[n];

	for(int i = 0; i < n; i++)
	    A[i] = In.nextInt();

	int c = Partition(A,0,n-1);

	for(int i = 0; i < n; i++)
	    {
		if(i == c) System.out.print("[" + A[i] + "]");
		else System.out.print(A[i]);

		if(i == n - 1) System.out.println();
		else System.out.print(" ");
	    }
    }
}