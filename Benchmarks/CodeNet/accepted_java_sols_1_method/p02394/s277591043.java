import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int time;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]);
		int h = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);
		int r = Integer.parseInt(s[4]);
		if (x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
