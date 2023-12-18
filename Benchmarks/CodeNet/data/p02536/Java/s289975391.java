import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] A = new int[M];
		int[] B = new int[M];
		int count = 0;

		for(int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			count = count + 1;
		}

		int ans = N - count - 1;
		System.out.println(ans);

	}

}