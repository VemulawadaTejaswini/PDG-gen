import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] A1 = new int[N];
		int[] B1 = new int[M];
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			A1[i] = Integer.parseInt(sc.next());
//			A.push(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < M; i++) {
			B1[i] = Integer.parseInt(sc.next());
//			B.push(Integer.parseInt(sc.next()));
		}
		for (int i = N-1; i >= 0; i--) {
			A.push(A1[i]);
		}
		for (int i = M-1; i >= 0; i--) {
			B.push(B1[i]);
		}
		int ans = 0;
		boolean flg = true;
		while (flg == true) {
			if (A.isEmpty() == true) {
				if (B.isEmpty() == true) {
					flg = false;
				} else {
					int b = B.pop();
					if (b > K) {
						flg = false;
					} else {
						K = K - b;
						ans++;
					}
				}
			} else {
				if (B.isEmpty() == true) {
					int a = A.pop();
					if (a > K) {
						flg = false;
					} else {
						K = K - a;
						ans++;
					}
				} else {
					int a = A.pop();
					int b = B.pop();
					if (a > K && b > K) {
						flg = false;
					} else {
						if (a < b) {
							K = K - a;
							ans++;
							B.push(b);
						} else {
							K = K - b;
							ans++;
							A.push(a);
						}
					}
				}
			}
		}
		System.out.println(ans);

	}
}