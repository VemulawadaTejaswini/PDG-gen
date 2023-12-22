import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			String inp = br.readLine();
			String chrp[] = inp.split(" ");
			int a = Integer.parseInt(chrp[0]);
			int b = Integer.parseInt(chrp[1]);
			String u = br.readLine();
			if (chr[0].equals(u)) {
				a--;
			} else {
				b--;
			}
			System.out.println(a + " " + b);
		}
	}
}