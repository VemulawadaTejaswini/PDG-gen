import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int r = Integer.parseInt(str[0]);
		int D = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		long ans = x;
		for (int i = 0; i < 10; i++) {
			ans = r * ans - D;
			System.out.println(ans);
		}
	}
}