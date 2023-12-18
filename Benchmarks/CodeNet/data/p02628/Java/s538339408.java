import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] f = new int[n];

			for (int i = 0; i < n; i++) {
				f[i] = sc.nextInt();
			}

			Arrays.sort(f);
			
			int ans = 0;

			for (int i = 0; i < k; i++) {
				ans += f[i];
			}

			System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
