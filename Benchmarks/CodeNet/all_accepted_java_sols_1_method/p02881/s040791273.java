import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		int n = (int) Math.sqrt((double) N);

//		他人の提出結果見る前のゴミ処理
//		parent: for (int i = n; i >= 0; i--) {
//			for (int j = n; j <= N; j++) {
//				if (i * j == N) {
//					System.out.println(i - 1 + j - 1);
//					break parent;
//				} else if (i * j > N) {
//					break;
//				}
//
//			}
//		}
		while (N % n != 0) {
			n--;
		}
		System.out.println(n + N / n - 2);
		sc.close();
	}

}