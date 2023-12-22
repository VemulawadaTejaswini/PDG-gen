
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int a,p,ans;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		a = Integer.parseInt(s[0]);
		p = Integer.parseInt(s[1]);
		ans = (a*3+p)/2;
		System.out.println(ans);
	}
}