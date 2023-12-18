import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] str = line.split(" ");
		int a = 0;
		for (int i = 0; i < x; i++) {
			a = a + Integer.parseInt(str[i]);
		}
		if (a % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}