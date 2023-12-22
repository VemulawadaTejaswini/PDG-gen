import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String start = str.substring(0, 1);
		String end = str.substring(str.length()-1, str.length());
		int len = str.length()-2;

		String ans = start + String.valueOf(len) + end;
		System.out.println(ans);
	}
}