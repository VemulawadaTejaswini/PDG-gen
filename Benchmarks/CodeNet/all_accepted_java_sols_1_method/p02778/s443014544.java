import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String ans = "";
		for(int i=0;i<W.length();i++){
			ans+="x";
		}
		System.out.println(ans);

	}


}
