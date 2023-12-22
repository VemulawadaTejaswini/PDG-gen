import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int x = in.nextInt();
		int t = in.nextInt();
		int ans = n / x;
		if (n % x != 0)
			ans++;
		ans *= t;
		System.out.println(ans);
	}
}
