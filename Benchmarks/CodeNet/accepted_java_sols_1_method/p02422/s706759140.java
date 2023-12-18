import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuffer str = new StringBuffer(line);
		StringBuffer ans = new StringBuffer();

		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			String[] set = br.readLine().split(" ");
			int a = Integer.parseInt(set[1]);
			int b = Integer.parseInt(set[2]) + 1;

			switch(set[0]) {
			case "print":
				ans.append(str.substring(a, b)).append("\n");
				break;
			case "reverse":
				StringBuilder str1 = new StringBuilder(str.substring(a, b));
				str.replace(a, b, str1.reverse().toString());
				break;
			case "replace":
				str.replace(a, b, set[3]);
				break;
			}
		}
		System.out.print(ans);
	}
}