import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int a, b;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		String[] line = str.split(" ");
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		if (a == b) {
			System.out.println("a == b");
		} else if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		}


	}

}
