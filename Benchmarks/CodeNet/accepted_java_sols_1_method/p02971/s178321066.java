import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];
		for ( int n = 0 ; n < N ; n++ ) {
			A[n] = sc.nextInt();
		}

		int first = 0;
		int second = 0;
		for ( int i = 0 ; i < N ; i++ ) {
			if ( first <= A[i] ) {
				second = first;
				first = A[i];
			} else if ( second <= A[i]) {
				second = A[i];
			}
		}

		StringBuffer ans = new StringBuffer();
		for ( int i = 0 ; i < N ; i++ ) {
			if ( A[i] == first ) {
				ans.append(second);
			} else {
				ans.append(first);
			}
			ans.append("\n");
		}
		System.out.println(ans.toString());
	}
}
