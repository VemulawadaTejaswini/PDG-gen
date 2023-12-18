import java.util.Scanner;

class Main
{
    static int count = 0;
    static int INFTY = 9999999;

    static void merge(int[]A,int left,int mid,int right)
    {
	int n1 = mid - left;
	int n2 = right - mid;
	int[]L = new int[50000];
	int[]R = new int[50000];

	int i;
	for( i = 0; i < n1; i++) 
	    L[i] = A[left + i];

	for ( i = 0; i < n2; i++)
	    R[i] = A[mid + i];

	L[n1] = INFTY;
	R[n2] = INFTY;
	
	i = 0;
	int j = 0;
	
	for(int k = left; k < right; k++)
	    if (L[i] <= R[j])
		{
		    A[k] = L[i];
		    i++;
		    count++;
		}

	    else 
		{
		    A[k] = R[j];
		    j++;
		    count++;
		}
     

    }
        
	
    static void mergeSort(int[]A,int left,int right)
    {
	int mid;

	if(left + 1 < right)
	    {
		mid = (left + 1 +right)/2;
		mergeSort(A, left, mid);
		mergeSort(A, mid, right);
		merge(A, left, mid, right);
	    }
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();
	int[]A = new int[n];

	for(int i = 0; i < n; i++)
	    A[i] = In.nextInt();

	mergeSort(A,0,n);

	for(int i = 0; i < n - 1; i++)
	    System.out.print(A[i] + " ");

	System.out.println(A[n - 1]);
	System.out.println(count);
    }
}