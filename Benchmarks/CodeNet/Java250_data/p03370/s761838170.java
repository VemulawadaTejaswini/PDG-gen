import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		Integer[] m = new Integer[N];
		int M = 0;
		for (int i=0; i<N; i++) {
			m[i] = sc.nextInt();
			M += m[i];
		}
		Arrays.sort(m);
		int S = m[0];
		int res = N + (X-M)/S;
		System.out.println(res);
	}
}
