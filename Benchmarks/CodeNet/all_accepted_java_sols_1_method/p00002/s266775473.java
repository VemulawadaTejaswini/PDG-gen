import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		while ((line = br.readLine()) != null) {
			String[] s = line.split(" ");
			System.out.println(Integer.toString(Integer.parseInt(s[0])
					+ Integer.parseInt(s[1])).length());
		}
	}

}