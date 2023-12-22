
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] j = new int[N + 1];
		j[0] = 0;
		for (int i = 1; i < j.length; i++) {
			j[i] = j[i - 1] + input[i - 1];
		}
		int ans = 0;
		for (int i = 0; i < j.length; i++) {
			if (j[i] <= X)
				ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}