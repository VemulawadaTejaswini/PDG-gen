import java.util.Scanner;

class Main{
    static public void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int A[] = new int[n];
	for(int i=0; i<n; i++){
	    A[i] = sc.nextInt();
	}

	for(int i=0; i<n; i++){
	    int v = A[i];
	    int j = i-1;
	    while(j>=0 && A[j]>v){
		A[j+1] = A[j];
		j--;
	    }
	    A[j+1] = v;
	    System.out.print(A[0]);
	    for(int x=1; x<n; x++){
		System.out.print(" "+A[x]);
	    }
	    System.out.println();
	}
    }
}

