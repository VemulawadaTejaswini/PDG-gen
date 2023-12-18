import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(A);
		int ans = 0;
		for (int i = 1; i < N; i++) {
			boolean flg = false;
			if (i < N - 1) {
				if (A[i] == A[i + 1]) {
					flg = true;
				}
			}
			if (flg == false) {
				for (int j = 0; j < i; j++) {
					if (A[i] % A[j] == 0) {
						flg = true;
						break;
					}
				}
			}
			if (flg == true) {
				ans++;
			}
		}
		System.out.println(N - ans);
	}
}
