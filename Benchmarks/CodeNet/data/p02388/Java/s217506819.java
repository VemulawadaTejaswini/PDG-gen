import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_B
 * 
 * @author Kyoro
 */
public class Main {

	int x;

	public void read() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		x = Integer.parseInt(reader.readLine());
	}

	public String solve() {
		return String.valueOf(x * x * x);
	}

	public static void main(String[] args) {
		Main main = new Main();
		try {
			main.read();
			out.println(main.solve());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

