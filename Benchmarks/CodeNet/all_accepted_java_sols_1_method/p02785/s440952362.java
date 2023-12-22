import java.util.Arrays;
import java.util.Scanner;

//AtCoder Beginner Contest 153
//C - Fennec vs Monster
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] arrH = new int[N];
		for (int i = 0; i < N; i++) {
			arrH[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		long ans = 0;
		Arrays.sort(arrH);
		for (int i = 0; i < N - K; i++) {
			ans += arrH[i];
		}
		System.out.println(ans);
	}
}
