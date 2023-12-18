import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int v[] = new int[N];

		for(int i = 0; i < N; i++) {
			v[i] = scan.nextInt();
		}

		Arrays.sort(v);

		double ans = v[0];

		for(int i = 1; i < N; i++) {
			ans = (ans + v[i])/2;
		}
		System.out.println(ans);
	}

}