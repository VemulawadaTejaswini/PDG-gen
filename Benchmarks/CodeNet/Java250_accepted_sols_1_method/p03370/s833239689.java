import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int m[] = new int[n];
		int summ = 0;
		
		for(int i = 0; i < n; ++i) {
			m[i] = sc.nextInt();
			summ += m[i];
		}
		Arrays.sort(m);
		sc.close();
		int ans = (x - summ) / m[0] + n;
		System.out.println(ans);
	}
}
