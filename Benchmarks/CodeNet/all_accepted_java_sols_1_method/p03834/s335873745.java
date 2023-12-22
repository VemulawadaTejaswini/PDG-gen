import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] ko = s.split(",", 0);
		String syuturyoku = ko[0] + " " + ko[1] + " " + ko[2];
		System.out.println(syuturyoku);
	}
}
