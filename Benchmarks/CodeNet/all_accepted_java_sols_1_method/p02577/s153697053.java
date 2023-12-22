import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++)
			ans += s.charAt(i) - (char) '0';
		if (ans % 9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
