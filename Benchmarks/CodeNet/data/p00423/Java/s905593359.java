import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			int N = Integer.parseInt(line);
			if (N == 0) {
				return;
			}

			int myScore = 0;
			int yourScore = 0;

			for (int i = 0; i < N; i++) {
				String readLine = br.readLine();
				readLine = readLine.trim();
				String[] readLineArray = readLine.split(" ");
				int mine = Integer.parseInt(readLineArray[0]);
				int yours = Integer.parseInt(readLineArray[1]);

				if (mine < yours) {
					// you win
					yourScore += mine + yours;
				} else if (mine > yours) {
					// i win
					myScore += mine + yours;
				} else {
					// draw
					myScore += mine;
					yourScore += yours;
				}
			}
			System.out.printf("%d %d\n", myScore, yourScore);
		}
	}
}