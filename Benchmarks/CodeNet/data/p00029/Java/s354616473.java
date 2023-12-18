import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String[] sentence = br.readLine().split(" ");
			int x = 0;
			int max = 0;
			String word = null;
			String longWord = sentence[0];

			for (int i = 0; i < sentence.length; i++) {

				for (int j = 0; j < sentence.length; j++) {

					if (sentence[i].equals(sentence[j])) {

						x++;

					}
					if (sentence[i].length() < sentence[j].length()) {

						longWord = sentence[j];

					}

				}
				if (max < x) {

					max = x;
					word = sentence[i];

				}

				x = 0;

			}

			System.out.println(word + " " + longWord);

		} finally {
			br.close();

		}
	}
}