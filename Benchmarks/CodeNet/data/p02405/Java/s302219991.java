import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String inputLine;
			while ((inputLine = br.readLine()) != null) {

				final String[] inputs = inputLine.split(" ");

				final Integer H = Integer.valueOf(inputs[0]);
				final Integer W = Integer.valueOf(inputs[1]);

				if (H.equals(0) && W.equals(0)) {
					break;
				}

				final String[] outputSet = {"#", "."};

				StringBuilder output = new StringBuilder();

				for(int h = 0; h < H; h++) {
					for(int w = 0; w < W; w++) {
						if(h % 2 == 0) {
							output.append(outputSet[w % 2]);
						} else {
							output.append(outputSet[(w + 1) % 2]);
						}
					}
					output.append("\n");
				}
				System.out.println(output);
			}
		}
	}
}
