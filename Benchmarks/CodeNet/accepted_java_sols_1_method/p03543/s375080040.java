import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			char a = (chr[0].charAt(0));
			char b = (chr[1].charAt(0));
			char c = (chr[2].charAt(0));
			char d = (chr[3].charAt(0));
			System.out.println((a==b&&b==c)||(b==c&&c==d)?"Yes"
							   :"No");

		}
	}
}