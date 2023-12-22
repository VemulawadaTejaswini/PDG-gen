import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int x = Integer.parseInt(tokens[1]);
		int t = Integer.parseInt(tokens[2]);
		int ans;
		if (n%x == 0)
			ans = n/x*t;
		else
			ans = (n/x+1)*t;
		System.out.println(ans);
	}
}
