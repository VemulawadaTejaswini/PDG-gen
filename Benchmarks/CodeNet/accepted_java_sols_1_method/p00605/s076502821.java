import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if ((n | k) == 0)
				break;
			int[] s = new int[k];
			for (int i = 0; i < k; i++)
				s[i] = sc.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < k; j++) {
					s[j] -= sc.nextInt();
				}
			}
			boolean flag = true;
			for (int i = 0; i < k; i++) {
				if (s[i] < 0) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "Yes" : "No");
		}
	}
}