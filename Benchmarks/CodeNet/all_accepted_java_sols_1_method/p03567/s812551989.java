import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String S = in.readLine();

		if(S.indexOf("AC") >= 0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}