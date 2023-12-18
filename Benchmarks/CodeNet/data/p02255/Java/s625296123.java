import java.util.Scanner;

public class ALDS1_01_A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////
		int n = 0;
		int[] A;
		
		n = sc.nextInt();
		sc.nextLine();
		A = new int[n];
		for (int i = 0; i < n; ++i)
			A[i] = sc.nextInt();
		
		_insertionSort.print(A);
		_insertionSort.sort(A, n);
		
		////////////////////////////////////
		sc.close();
	}
	
}