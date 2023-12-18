import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		Pattern p = Pattern.compile("^A?+KIHA?+BA?+RA?+$");

		if(p.matcher(input).matches()){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
