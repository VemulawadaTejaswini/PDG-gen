import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int q = 0;
		List<String> wordsSList = new ArrayList<>();
		List<String> wordsTList = new ArrayList<>();
		int count = 0;

		try {
			n = Integer.valueOf(br.readLine());
			String[] wordsS = br.readLine().split(" ");
			q = Integer.valueOf(br.readLine());
			String[] wordsT = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				wordsSList.add(wordsS[i]);
			}
			for (int i = 0; i < q; i++) {
				wordsTList.add(wordsT[i]);
			}

			for (int i = 0; i < wordsSList.size(); i++) {
				for (int j = 0; j < wordsTList.size(); j++) {
					String s = wordsSList.get(i);
					String t = wordsTList.get(j);
					if (s.equals(t)) {
						count++;
						wordsTList.set(j, " ");
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			Logger.getGlobal();
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				Logger.getGlobal();
			}
		}
	}
}