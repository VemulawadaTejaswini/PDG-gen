import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int five = 0;
			int seve = 0;
			for (int i = 0; i < chr.length; i++) {
				if (Integer.parseInt(chr[i]) == 5) {
					five++;
				} else if (Integer.parseInt(chr[i]) == 7) {
					seve++;
				} else {
					break;
				}
			}
			if (five == 2 && seve == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}