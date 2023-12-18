import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		int ans = 0;
		boolean flag = false;
		for (int i = 1; i <= N; i++) {
			if ((int)Math.floor(i * 1.08) == N) {
				ans = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(ans);
		}
		else {
			System.out.println(":(");
		}
	}
}