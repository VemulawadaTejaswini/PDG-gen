
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] A = new int[N];
		int count = 1;

		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		for(int i = 0; i < N; i++) {
//			System.out.println("i"+A[i]);
			for(int j = 1; j < N; j++) {
//				System.out.println("J"+A[j]);
				if(K >= Math.abs(A[j] - A[i])) {
//					System.out.println("j-i"+A[j]+A[i]);
					count = count + 1;
					i = j;

				}

			}
		}
		System.out.println(count);

	}

}