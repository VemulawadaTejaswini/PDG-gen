import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		char[] buf = new char[21];
		while (is.read(buf) != -1) {
		}
		for (int i = buf.length - 1; i >= 0; i--) {
			if (buf[i] > '\u002F')
				System.out.print(buf[i]);
		}
		System.out.print("\n");
	}
}