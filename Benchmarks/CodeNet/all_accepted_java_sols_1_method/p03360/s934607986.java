import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			String inputs[] = str.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			int c = Integer.parseInt(inputs[2]);
			int k = Integer.parseInt(br.readLine());
			for (int i = 0; i < k; i++) {
				if (a > b && a>c) {
					a *= 2;
				} else if (b > c) {
					b *= 2;
				} else {
					c *= 2;
				}
			}
			System.out.println(a+b+c);
		}
	}
}
