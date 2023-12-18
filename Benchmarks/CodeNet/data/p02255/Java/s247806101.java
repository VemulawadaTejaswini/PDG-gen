import java.util.Scanner;

class ALDS1_1_A
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int N = In.nextInt();
	int []A = new int[N];

	int i,j;

	for(i = 0; i < N; i++)
	    {
		A[i] = In.nextInt();
	    }

	for(i = 1; i < N ; i++)
	    {
		int v = A[i];
		j = i - 1;
		
		while(j >= 0 && A[j] > v)
		    {
			A[j + 1] = A[j];
			j--;
			
		    }
		A[j + 1] = v;
		
	

		for(int m = 0; m < N; m++)
		    System.out.print(A[m] + " ");
		System.out.println();
	    }	
        
    }
}