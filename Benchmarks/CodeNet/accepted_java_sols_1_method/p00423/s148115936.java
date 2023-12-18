import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			} else {
				int a = 0, b = 0, suma = 0, sumb = 0;
				while (n > 0) {
					line = br.readLine();
					a = Integer.parseInt(line.split(" ")[0]);
					b = Integer.parseInt(line.split(" ")[1]);
					if (a > b) {
						suma += (a + b);
					} else if (a == b) {
						suma += a;
						sumb += b;
					} else {
						sumb += (a + b);
					}
					n--;
				}
				System.out.println(suma + " " + sumb);
			}
		}
	}
}