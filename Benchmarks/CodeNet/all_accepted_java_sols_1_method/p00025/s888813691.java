
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String inputA = br.readLine();
			if (inputA == null || inputA.isEmpty()) {
				break;
			}

			String inputB = br.readLine();
			if (inputB == null || inputB.isEmpty()) {
				break;
			}

			String[] inputAstr = inputA.split(" ");
			String[] inputBstr = inputB.split(" ");

			int blow = 0;
			int hit = 0;

			// blow?????¢???
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 4; ++j) {

					if (inputAstr[i].equals(inputBstr[j])) {
						// ??????????????¢???
						if (i == j) {
							++hit;
						} else {
							++blow;
						}
					}
				}
			}

			System.out.println(hit + " " + blow);

		}
	}
}