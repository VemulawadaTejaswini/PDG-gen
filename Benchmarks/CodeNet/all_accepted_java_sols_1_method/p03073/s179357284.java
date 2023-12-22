
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		boolean temp,now;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split("");
		now = Integer.parseInt(s[0]) == 1;
		for(int i = 1;i < s.length;++i) {
			temp = Integer.parseInt(s[i]) == 1;
			if(now == temp) {
				ans++;
			}
			now = !now;
		}
		System.out.println(ans);
	}
}