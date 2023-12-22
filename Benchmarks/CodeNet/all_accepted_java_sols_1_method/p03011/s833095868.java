import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int p = Integer.parseInt(chr[0]);
			int q = Integer.parseInt(chr[1]);
			int r = Integer.parseInt(chr[2]);

			 System.out.println(p+q+r-Math.max(p, Math.max(q, r)));
		}
	}
}