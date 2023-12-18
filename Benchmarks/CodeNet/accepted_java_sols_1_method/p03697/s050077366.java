import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static InputStreamReader is = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(is);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String S = br.readLine();
			String[] Ss = S.split(" ");
			int a = Integer.parseInt(Ss[0]);
			long b = Long.parseLong(Ss[1]);
			if(a+b<10) {
				System.out.println(a+b);
			}else {
				System.out.println("error");
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}