import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		char[] t = br.readLine().toCharArray();
		br.close();

		char[] ss = new char[s.length * 2];
		System.arraycopy(s, 0, ss, 0, s.length);
		System.arraycopy(s, 0, ss, s.length, s.length);

		for (int i = 0; i < t.length; i++) {
			boolean flg = true;
			for (int j = 0; j < t.length; j++) {
				if (ss[i + j] != t[j]) {
					flg = false;
					break;
				}
			}
			if (flg) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
