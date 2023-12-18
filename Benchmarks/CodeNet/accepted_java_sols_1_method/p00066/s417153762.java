import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[][] c = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };
		while ((line = bf.readLine()) != null) {
			char[] b = line.toCharArray();
			boolean f = false;
			char k = 'o';
			for (int i = 0; i < c.length; i++) {
				if (b[c[i][0]] == k && b[c[i][1]] == k && b[c[i][2]] == k) {
					System.out.println(k);
					f = true;
					break;
				}
			}
			if (f)
				continue;
			k = 'x';
			for (int i = 0; i < c.length; i++) {
				if (b[c[i][0]] == k && b[c[i][1]] == k && b[c[i][2]] == k) {
					System.out.println(k);
					f = true;
					break;
				}
			}
			if (!f)
				System.out.println('d');
		}
	}
}