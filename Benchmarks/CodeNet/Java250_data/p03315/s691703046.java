import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static int solve(String s) {
		int r = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '+')
				r++;
			else
				r--;
		return r;
	}
}