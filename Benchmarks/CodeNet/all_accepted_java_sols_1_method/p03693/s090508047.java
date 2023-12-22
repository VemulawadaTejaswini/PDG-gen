import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int ans = Integer.parseInt(chr[0]+chr[1]+chr[2]);
			System.out.println(ans%4==0?"YES":"NO");

		}
	}
}
