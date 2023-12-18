import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (String str; (str = br.readLine()) != null; /* */) {
			String[] data = str.split(",");
			int[] l = new int[11];
			l[0] = 0;
			for (int i = 1; i <= 10; i++) {
				l[i] = l[i-1] + Integer.parseInt(data[i-1]);
			}
			int v1 = Integer.parseInt(data[10]);
			int v2 = Integer.parseInt(data[11]);

			int p = l[10]*v1 / (v1+v2);
			for (int i=0; i <= 9; i++) {
				if (p == l[i]) {
					if (l[10]*v1 % (v1+v2) == 0) {
						System.out.println(i);
						break;
					} else {
						System.out.println(i+1);
						break;
					}
				} else if (l[i] < p && p < l[i+1]) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}