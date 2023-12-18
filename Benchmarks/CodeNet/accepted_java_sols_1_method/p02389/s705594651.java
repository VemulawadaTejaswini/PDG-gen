import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brstr = br.readLine();

		// 文字列を指定した区切り文字(" ")によって分割し,それぞれの配列の要素として格納する
		String[] str = brstr.split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		System.out.println(x * y + " " + (x + y) * 2);
	}

}