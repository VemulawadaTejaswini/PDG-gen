import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
			System.out.println(a==b&&a==c?"1"
							  :a==b&&b!=c?"2"
							  :a==c&&b!=c?"2"
							  :b==c&&a!=c?"2"
							  :"3");
		}
	}
}
