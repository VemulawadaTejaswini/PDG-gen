import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] r = new char[4];
		char[] a = new char[4];
		while (br.read(r) == 4 && br.read() != -1 && (br.read(a) == 4)
				&& br.readLine() != "dummy") {
			int hit = 0, brow = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (r[i] == a[j]) {
						if (i == j) {
							hit++;
						} else {
							brow++;
						}
						break;
					}
				}
			}
			System.out.println(hit + " " + brow);
		}

	}
}