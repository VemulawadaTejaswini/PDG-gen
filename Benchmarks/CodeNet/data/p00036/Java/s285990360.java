import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int l = 0;
		int m = -1;
		boolean[] f = new boolean[64];
		while ((line = br.readLine()) != null) {
			if (line.length() < 8)
				continue;
			for (int i = 0; i < 8; i++) {
				f[l * 8 + i] = line.charAt(i) == '1';
				if (m < 0 && f[l * 8 + i])
					m = l * 8 + i;
			}
			l++;
			if (l == 8) {
				if (f[m + 1]) {
					if (f[m + 2]) {
						System.out.println("C");
					} else if (f[m + 7]) {
						System.out.println("G");
					} else if (f[m + 8]) {
						System.out.println("A");
					} else {
						System.out.println("E");
					}
				} else if (f[m + 7]) {
					System.out.println("D");
				} else if (f[m + 16]) {
					System.out.println("B");
				} else if (f[m + 17]) {
					System.out.println("F");
				}
				l = 0;
				m = -1;
			}
		}
	}
}