import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(
				System.in));
		String line;
		while ((line = stdReader.readLine()) != null) {
			String[] tokens = line.split(" ");
			int x = Integer.parseInt(tokens[0]);
			int y = Integer.parseInt(tokens[1]);
			System.out.println(x + y);
		}

	}

}
