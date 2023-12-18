
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		String ans;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);
		if((a < c && c < b) || (a > c && c > b)) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}