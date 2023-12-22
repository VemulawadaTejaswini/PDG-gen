import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int result = 0;
			for (int i = 1; i < n / 2 + 1; i++) {
				int sum = i;
				for (int j = i + 1; j < n; j++) {
					sum += j;
					if (sum == n) {
						result++;
						break;
					} else if (sum > n)
						break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}