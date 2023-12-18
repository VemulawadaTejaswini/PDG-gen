
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] ans = new int[N];
		for (int i = 0; i < input.length; i++) {
			int tmp = input[i];
			int sum = input[tmp - 1];
			ans[sum - 1] = tmp;
		}
		for (int i = 0; i < ans.length; i++) {
			if (i == ans.length - 1)
				System.out.print(ans[i]);
			else
				System.out.print(ans[i] + " ");
		}
		sc.close();
	}
}