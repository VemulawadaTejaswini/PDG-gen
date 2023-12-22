import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);
		int d = Integer.parseInt(line[3]);

		String ans = "No";

		if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
			ans = "Yes";
		} else if (Math.abs(a - c) <= d) {
			ans = "Yes";

		}
		System.out.println(ans);
	}

}
