import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String cards = in.readLine();
			if (cards.equals("-")) {
				break;
			}
			int num = cards.length();
			int time = Integer.parseInt(in.readLine());
			for (int i = 0; i < time; i++) {
				int shuffle = Integer.parseInt(in.readLine());

				cards = cards.substring(shuffle, num)
						+ cards.substring(0, shuffle);
			}
			System.out.println(cards);
		}
	}
}