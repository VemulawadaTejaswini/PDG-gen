import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String N = in.readLine();


		String str[] = N.split(" ");
		String ans = "No";
		if(str[0].equals(str[1]) && str[1].equals(str[2])){
			ans = "Yes";
		}

		System.out.println(ans);
	}


}
