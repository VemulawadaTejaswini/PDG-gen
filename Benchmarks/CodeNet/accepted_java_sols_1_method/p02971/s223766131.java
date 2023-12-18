import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		
		int largest = 0;
		int largestI = 0;
		int second = 0;
		int secondI = 0;
		
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
			if(largest < A[i]) {
				largest = A[i];
				largestI = i;
			} else if(second < A[i]) {
				second = A[i];
				secondI = i;
			}
		}
		scan.close();

		for(int i=0; i<A.length; i++) {
			if(i==largestI) {
				System.out.println(A[secondI]);
			} else {
				System.out.println(A[largestI]);
			}
		}
		
	}

}