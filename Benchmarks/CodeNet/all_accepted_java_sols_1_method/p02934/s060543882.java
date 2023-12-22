import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (Integer i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		double ans = 0;
		for (int i = 0; i < input.length; i++) {
			ans += (double) 1 / input[i];
		}
		ans = 1 / ans;
		System.out.println(String.format("%.5f", ans));
		sc.close();
	}
}