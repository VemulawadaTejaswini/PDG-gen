
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int d,t,s;
		String ans;
		String str;
		String[] sa;
		str = bf.readLine();
		sa = str.split(" ");
		d = Integer.parseInt(sa[0]);
		t = Integer.parseInt(sa[1]);
		s = Integer.parseInt(sa[2]);
		if(d <= t*s) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}