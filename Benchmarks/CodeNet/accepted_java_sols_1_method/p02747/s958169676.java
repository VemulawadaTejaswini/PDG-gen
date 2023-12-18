import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine().replace("hi", "");
			System.out.println(str.length() > 0 ? "No" : "Yes");
		} finally {
			br.close();
		}
	}
}
