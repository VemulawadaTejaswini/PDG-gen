import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int count = 0;

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'o') {
				count++;

			}
		}

		System.out.println(700 + count * 100);

	}

}
