import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		boolean[] s = new boolean[n];
		for (int i = 0; i < k; i++) {
			int d = in.nextInt();
			for (int j = 0; j < d; j++)
				s[in.nextInt() - 1] = true;
		}
		int r = 0;
		for (int i = 0; i < n; i++)
			if (!s[i])
				r++;
		System.out.println(r);
	}
}