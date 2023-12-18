import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			if (i % 2 == 0 && a % 2 == 1)
				ans++;
		}
		System.out.println(ans);

	}

}
