import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strengh = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] lines = line.split(" ");

		for (int i = strengh - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(lines[i]);
			} else {
				System.out.print(lines[i] + " ");
			}
		}
		System.out.println();
	}
}