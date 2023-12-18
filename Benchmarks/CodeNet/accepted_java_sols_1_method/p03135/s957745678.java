import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			double t = Integer.parseInt(chr[0]);
			double x = Integer.parseInt(chr[1]);
			 System.out.println(t/x);
		}
	}
}