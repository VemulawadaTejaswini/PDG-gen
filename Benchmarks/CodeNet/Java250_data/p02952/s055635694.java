
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		int ans = 0;
		for (Integer i = 1; i <= N; i++) {
			if (i.toString().length() % 2 != 0)
				ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}