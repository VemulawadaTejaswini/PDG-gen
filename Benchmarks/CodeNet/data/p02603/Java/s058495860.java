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

		int before = A[0];
		int after = 0;
		int cash = 1000;

		for(int i=1; i<N; i++) {
			if(A[i] <= before) {
				before = Math.min(before, A[i]);
			}else {
				after = Math.max(after, A[i]);
				if(i<N-1 && after <= A[i+1]) {
					continue;
				}
				int count = cash / before;
				cash += (after-before) * count;
				//初期化
				before = 500;
				after = 0;
			}
		}

		System.out.println(cash);

	}


}
