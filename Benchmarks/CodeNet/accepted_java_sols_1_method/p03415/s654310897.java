import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = (br.readLine());
		String b = (br.readLine());
		String c = (br.readLine());

		String a2 = a.substring(0, 1);
		String b2 = b.substring(1, 2);
		String c2 = c.substring(2, 3);

		System.out.println(a2 + b2 + c2);
	}

}