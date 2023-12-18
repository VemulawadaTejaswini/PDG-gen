import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			int n = Integer.parseInt(str);
			int[] cardA = new int[n];
			int[] cardB = new int[n];
			int scoreA = 0;
			int scoreB = 0;
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				String[] number = str.split(" ");
				cardA[i] = Integer.parseInt(number[0]);
				cardB[i] = Integer.parseInt(number[1]);
				if (cardA[i] > cardB[i]) {
					scoreA = scoreA + cardA[i] + cardB[i];
				} else if (cardA[i] < cardB[i]) {
					scoreB = scoreB + cardA[i] + cardB[i];
				} else {
					scoreA = scoreA + cardA[i];
					scoreB = scoreB + cardB[i];
				}
			}
			System.out.println(scoreA + " " + scoreB);
			str = br.readLine();
		}
	}
}