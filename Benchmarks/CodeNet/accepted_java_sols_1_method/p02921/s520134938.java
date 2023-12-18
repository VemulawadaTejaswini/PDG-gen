
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		String s,t;
		s = bf.readLine();
		t = bf.readLine();
		for(int i = 0;i < 3;++i) {
			if(s.charAt(i) == t.charAt(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}