import java.util.Scanner;

class Sort {
    public static void main (String args[]) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int A[] = new int[N];
	for(int i = 0;i < N;i++){
	    A[i] = scanner.nextInt();		
	}
	for(int k = 0;k < N;k++){
	    System.out.print(A[k]);
	    if(k == N - 1) break;
	    System.out.print(" ");
	}
	System.out.println();
	int v, j;	    
	for(int i = 1;i < N;i++){
	    v = A[i];
	    j = i - 1;
	    while(j >= 0 && A[j] > v){
		A[j + 1] = A[j];
		j--;
		A[j+1] = v;
	    }
	    for(int k = 0;k < N;k++){
		System.out.print(A[k]);
		if(k == N - 1) break;
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}

