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

				StringBuilder output = new StringBuilder();

				for(Integer h = 0; h < H; h++) {
					for(Integer w = 0; w < W; w++) {
						if(0 < h && h < H - 1
								&& 0 < w && w < W - 1) {
							output.append(".");
						} else {
							output.append("#");
						}
					}
					output.append("\n");
				}
				System.out.println(output);
			}
		}
	}
}
