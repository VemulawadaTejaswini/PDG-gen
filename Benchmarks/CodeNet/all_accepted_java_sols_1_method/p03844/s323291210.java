import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] S = br.readLine().split(" ");
			int ans = 0;
			if (S[1].equals("+")) {
				ans = Integer.parseInt(S[0]) + Integer.parseInt(S[2]);
			} else {
				ans = Integer.parseInt(S[0]) - Integer.parseInt(S[2]);
			}

			System.out.println(ans);
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}