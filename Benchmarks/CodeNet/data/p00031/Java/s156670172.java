import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			int weight = Integer.parseInt(str);
			int n = 0;
			while (weight != 1)
				if (weight % 2 == 1) {
					System.out.print((int) Math.pow(2, n) + " ");
					n++;
					weight /= 2;
				}
			System.out.println((int) Math.pow(2, n));
			str = br.readLine();
		}
	}
}