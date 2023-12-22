import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short point1 = 0, point2 = 0, n = Short.parseShort(in.readLine());
		for (int i = 0; i < n; i++) {
			String[] card = in.readLine().split(" ");
			if (card[0].compareTo(card[1]) > 0) {
				point1 += 3;
			} else if (card[0].compareTo(card[1]) < 0) {
				point2 += 3;
			} else if (card[0].compareTo(card[1]) == 0) {
				point1++;
				point2++;
			}
		}
		System.out.println(point1 + " " + point2);
	}
}