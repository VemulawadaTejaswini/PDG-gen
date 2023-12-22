import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();

		int []m = new int [N];
		for(int i = 0; i < N; i++) {
			m[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(m);
		int res = X;
		for(int i = 0; i < N; i++) {
			res -= m[i];
		}
		int ans = N + res / m[0];
		System.out.println(ans);
	}
}