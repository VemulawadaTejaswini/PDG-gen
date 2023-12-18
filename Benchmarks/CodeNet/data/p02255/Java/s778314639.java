import java.util.Scanner;

class Main {
    public static void insertsort(int[] A, int n) {
	for (int i = 0; i < n; i++) {
	    int v = A[i];
	    int j = i-1;
	    while (j >= 0 && A[j] > v) {
		A[j+1] = A[j];
		j--;
	    }
	    A[j+1] = v;
	    for (int k = 0; k < n; k++) {
		System.out.print(A[k]);
		if (k < n-1)System.out.print(" ");
		else System.out.print('\n');
	    }
	}
    }

    public static void main(String[] av) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] A = new int[n];

	for (int i = 0; i < n; i++) {
	    A[i] = sc.nextInt();
	}

	insertsort(A,n);
    }
}
