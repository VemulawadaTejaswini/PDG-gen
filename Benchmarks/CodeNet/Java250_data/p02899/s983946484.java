import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans[] = new int[n];

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			ans[num - 1] = i + 1;
		}

		for (int num : ans) {
			System.out.println(num);
		}

	}
}
