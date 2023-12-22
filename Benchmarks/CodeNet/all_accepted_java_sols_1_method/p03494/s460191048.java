import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		int res = 0;

		while (true) {
			
			boolean existOdd = false;

			// check
			for (int i = 0; i < A.length; i++) {

				if (A[i] % 2 != 0) {
					existOdd = true;
					break;
				}
			}
			
			if (existOdd) {
				break;
			}

			// update
			for (int i = 0; i < A.length; i++) {
				A[i] = A[i] / 2;
			}
			
			res++;
		}
		
		System.out.println(res);
	}

}