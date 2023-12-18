import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int cash = 1000;
		for(int i=0; i<N-1; i++) {
			if(A[i] <= A[i+1]) {
				cash += (A[i+1] - A[i]) * (cash / A[i]);
			}
		}

		System.out.println(cash);

	}


}
