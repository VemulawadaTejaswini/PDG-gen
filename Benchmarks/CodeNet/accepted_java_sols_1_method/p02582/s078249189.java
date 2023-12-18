import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		if (s.equals("RRR")) {
			System.out.println("3");
		} else if (s.equals("RRS")) {
			System.out.println("2");
		} else if (s.equals("SRR")) {
			System.out.println("2");
		} else if (s.equals("RSS")) {
			System.out.println("1");
		} else if (s.equals("SRS")) {
			System.out.println("1");
		} else if (s.equals("SSR")) {
			System.out.println("1");
		} else if (s.equals("SSS")) {
			System.out.println("0");
		} else if (s.equals("RSR")) {
			System.out.println("1");
		}
	}
}
