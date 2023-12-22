import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
		String x = "ABC";
		int ans = 0;
		for (int i = 0; i + 3 <= n; i++) {
			if (s.substring(i, i + 3).equals(x))
				ans++;
		}
		System.out.println(ans);
  }
}