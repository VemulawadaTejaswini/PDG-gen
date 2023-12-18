import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int l = in.nextInt();
		int r = in.nextInt();
		int d = in.nextInt();
		int ans = r / d - l / d;
		if (l % d == 0)
			ans++;
		System.out.println(ans);

	}

}
