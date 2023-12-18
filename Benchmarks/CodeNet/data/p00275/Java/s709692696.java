import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) {
				break;
			}

			int N = Integer.parseInt(line);
			char[] cards = br.readLine().toCharArray();

			int p, b = 0;
			int[] score = new int[N];

			for (int i = 0; i < cards.length; i++) {
				p = i % N;
				switch (cards[i]) {
				case 'M':
					score[p]++;
					break;
				case 'S':
					b += ++score[p];
					score[p] = 0;
					break;
				case 'L':
					score[p] += ++b;
					b = 0;
					break;
				default:
					break;
				}
			}
			Arrays.sort(score);
			for (int i = 0; i < score.length; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println(b);
		}
	}
}