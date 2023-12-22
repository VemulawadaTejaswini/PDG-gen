import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] A = new int[1001];
		int n, i, j, key;
		n = input.nextInt();
		for(i = 1; i <=n; i++)
		{
			A[i]=input.nextInt();
		}
		for(i = 1; i <= n; i++){
  			key = A[i];
  			j = i - 1;
  			while( j >= 0 && A[j] > key){
  				A[j+1] = A[j];
  				j--;
  			}
  			A[j+1] = key;
  			trace(A, n);
  		}
	}

	public static void trace(int A[], int n)
	{
		for(int i=1;i<=n;i++){
			if(i>1)System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
	}
}