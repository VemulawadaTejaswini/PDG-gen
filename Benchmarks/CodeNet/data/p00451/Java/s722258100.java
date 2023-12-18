import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] strA = str.split("");
			str = br.readLine();
			String[] strB = str.split("");
			int lengthA = strA.length;
			int lengthB = strB.length;
			int maxn = 0;
			for (int i = 0; i < lengthA; i++) {
				int n = 0;
				int p = 0;
				while (p < lengthA && i + p < lengthB) {
					if (strA[p].equals(strB[i + p])) {
						n++;
						if (maxn < n)
							maxn = n;
					} else {
						n = 0;
					}
					p++;
				}
			}
			for (int i = 0; i < lengthB; i++) {
				int n = 0;
				int p = 0;
				while (p < lengthB && i + p < lengthA) {
					if (strB[p].equals(strA[i + p])) {
						n++;
						if (maxn < n)
							maxn = n;
					} else {
						n = 0;
					}
					p++;
				}
			}
			System.out.println(maxn);
			str = br.readLine();
		}
	}
}