import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	/**
	 * Q1
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hoge = br.readLine();
		hoge = hoge.substring(0, 4)+" "+hoge.substring(4,12);

		System.out.println(hoge);

	}

}
