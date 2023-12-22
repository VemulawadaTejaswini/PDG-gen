import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			int in = Integer.parseInt(br.readLine());
			int re = in/15;

			System.out.println(in*800 - re*200);

		}
	}
}
