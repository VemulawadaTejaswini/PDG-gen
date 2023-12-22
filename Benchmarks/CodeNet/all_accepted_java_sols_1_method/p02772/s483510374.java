import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String ans = "APPROVED";

		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if(A[i] % 2 == 0) {
				if(A[i] % 3 != 0 && A[i] % 5 != 0)
					ans = "DENIED";
			}
		}

		System.out.println(ans);
	}

}

