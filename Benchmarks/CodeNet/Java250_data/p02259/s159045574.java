import java.util.Scanner;

public class Main {

	// define variables & initialize
	private static int cnt = 0;	// how many bubbleSort is used
	
	// sort method :: sort given array using insertion Sort
	public static void sort(int[] _A, int _n) {
		int flg = 1;
		while (flg != 0) {
			flg = 0;
			for (int i = _n - 1; i >= 1; --i) {
				if (_A[i] < _A[i - 1]) {
					_A[i] = _A[i] ^ _A[i - 1];
					_A[i - 1] = _A[i] ^ _A[i - 1];
					_A[i] = _A[i] ^ _A[i - 1];
					flg = 1;
					++cnt;
				}
			}
		}
		
	}
	
	// print method :: print array
	public static void print(int[] _A) {
		for (int i = 0; i < _A.length; ++i) {
			System.out.print(_A[i]);
			if (i != _A.length - 1)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	// get method :: get cnt (how many bubbleSort was used)
	public static int get() {
		return cnt;
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////
		int n = 0;
		int[] A;
		
		n = sc.nextInt();
		A = new int[n];
		
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}
		
		sort(A, n);
		print(A);
		System.out.println(get());
		
		////////////////////////////////////
		sc.close();
	}



}