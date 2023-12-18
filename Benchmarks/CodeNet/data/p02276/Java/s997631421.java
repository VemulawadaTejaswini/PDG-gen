import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
	
	static int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		for (int j = p; j < r - 1; j++) {
			if (A[j] <= x) {
				i++;
				A[i] = A[j];
			}
			A[i + 1] = A[r];
		}
		return i + 1;
	}

}