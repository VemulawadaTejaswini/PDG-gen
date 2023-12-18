
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int A[]= new int[1000001], i, q;

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();

	for(i=0; i<n; i++){
	    Scanner sc = new Scanner(System.in);
	    A[i] = sc.nextInt();
	}
  
	q = partition(A, 0, n-1);

	String str = "";
	for(i=0; i<n; i++){
	    if(i!=0) str += " ";
	    if(i==q) str += "[";
	    str += "" + A[i];
	    if(i==q) str += "]";
	}
	System.out.println(str);
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