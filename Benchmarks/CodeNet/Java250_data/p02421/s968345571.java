import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tarouPoint = 0;
		int hanakoPoint = 0;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] cards = br.readLine().split(" ");
			int j = cards[0].compareTo(cards[1]);
			if (j < 0) hanakoPoint += 3;
			else if (0 < j) tarouPoint += 3;
			else {
				tarouPoint++;
				hanakoPoint++;
			}
		}
		System.out.println(tarouPoint + " " + hanakoPoint);
	}
}