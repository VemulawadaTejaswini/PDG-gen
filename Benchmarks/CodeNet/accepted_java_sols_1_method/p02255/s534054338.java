import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	int n;
	int[] A;
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	A = new int[n];
	
	for(int i=0; i<n; i++){
	    A[i] = sc.nextInt();
	}

	for(int i=1; i<n;i++){
	    for(int k=0; k<n-1; k++){
		System.out.print(A[k]+" ");
	    }
	    System.out.print(A[n-1]);
	    System.out.println("");
	    int v = A[i];
	    int j = i-1;
	    while(j>=0 && A[j]>v){
		A[j+1] = A[j];
		j--;
	    }
	    A[j+1] = v;
	    
	}
	for(int k=0; k<n-1; k++){
	    System.out.print(A[k]+" ");
	}
	System.out.print(A[n-1]);
	System.out.println("");
    }
}

