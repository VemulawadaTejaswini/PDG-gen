import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int x;
		String str;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		x = Integer.parseInt(str);
		System.out.println(x * x * x);
	}
}

