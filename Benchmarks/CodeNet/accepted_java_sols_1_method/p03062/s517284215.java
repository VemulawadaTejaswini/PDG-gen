import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++ ) {
			A[i] = Integer.parseInt(sc.next());
		}

		//Logic
		long answer = 0;
		long minusNum = 0;
		long minNum = 1000000001;
		for(int i = 0 ; i < N ; i++) {
			answer += Math.abs(A[i]);
			if(A[i] < 0) {
				minusNum += 1;
			}
			minNum = Math.min(minNum, Math.abs(A[i]));
		}

		//Output
		if(minusNum % 2 != 0) {
			answer = answer - (2 * minNum);
		}
		System.out.println(answer);

	}

}
