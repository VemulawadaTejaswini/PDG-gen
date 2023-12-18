import java.util.Scanner;

 public class Main{
    public static void main(String[] args){
	int A[]= new int[100000], i, q;

	int n = Integer.parseInt(args[0]);
	for(i=0; i<n; i++){
	    Scanner sc = new Scanner(System.in);
	    A[i] = sc.nextInt();
	}
  
	q = partition(A, 0, n-1);
  
	for(i=0; i<n; i++){
	    if(i!=0) System.out.printf(" ");
	    if(i==q) System.out.printf("[");
	    System.out.printf("%d", A[i]);
	    if(i==q) System.out.printf("]");
	}
	System.out.printf("\n");
    }
    
    public static int partition(int A[], int p, int r){
	int x, i, j, t;
	x = A[r];
	i = p-1;
	for(j=p; j<r; j++){
	    if(A[j]<=x){
		i++;
		t = A[i]; A[i] = A[j]; A[j] = t;
	    }
	}
	t = A[i+1]; A[i+1] = A[r]; A[r] = t;
	return i+1;
    }
}