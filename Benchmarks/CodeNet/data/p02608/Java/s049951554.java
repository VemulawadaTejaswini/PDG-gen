import java.util.*;

public class Main {
	private static int go(int n) {
		int c = 0;
		for (int x = 1; x < n; ++x) {
          	if (x * x + 1 + 1 + x + 1 + x > n) break;
			for (int y = 1; y < n; ++y) {
	          	if (x * x + y * y + 1 + x * y + y + x > n) break;
				for (int z = 1; z < n; ++z) {
					if (x * x + y * y + z * z + x * y + y * z + z * x == n) c++;
					if (x * x + y * y + z * z + x * y + y * z + z * x > n) break;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = 0; i < N; ++i) {
			System.out.println(go(i + 1));
		}
		
	}
}
