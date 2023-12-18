import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i]=Integer.parseInt(sc.next());
		}

		sc.close();

		int count = 0;
		boolean inc = false;
		boolean dec = false;
		boolean first = true;
		for(int i = 1; i < N; i++) {
			if(first) {
				first = false;
				if(A[i] > A[i-1]) {
					inc = true;
					dec = false;
				}else if(A[i] < A[i-1]) {
					inc = false;
					dec = true;
				}else if(A[i] == A[i-1]) {
					inc = false;
					dec = false;
					first = true;
				}
			}

			if((A[i] < A[i-1] && inc) || (A[i] > A[i-1] && dec)) {
				inc = false;
				dec = false;
				first = true;
				count++;
			}
		}

		count++;
		System.out.println(count);

	}

}
