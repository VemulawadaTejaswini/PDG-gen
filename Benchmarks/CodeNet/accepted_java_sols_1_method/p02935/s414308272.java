import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] v = new int[N];
		Arrays.setAll(v, i -> sc.nextInt());
		Arrays.sort(v);
		double ans = (v[0] + v[1]) / 2.0;
		for(int i = 2; i < N; i++) {
			ans = (ans + v[i]) / 2.0;
		}
		System.out.println(ans);
	}
}