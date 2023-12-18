
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int i, q;

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int A[]= new int[n];
	    
	for(i=0; i<n; i++){
	    A[i] = s.nextInt();
	}
  
	q = partition(A, 0, n-1);

	for(i=0; i<n; i++){
	    if(i!=0) System.out.print(" ");
	    if(i==q) System.out.print("[");
	    System.out.print(A[i]);
	    if(i==q) System.out.print("]");
	}
	System.out.println();
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