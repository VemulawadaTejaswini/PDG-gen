
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,n;
		int[] b;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		b = new int[n-1];
		str = bf.readLine();
		s = str.split(" ");
		for(int i = 0;i < n-1;++i) {
			b[i] = Integer.parseInt(s[i]);
		}
		ans = b[0];
		for(int i = 1;i < n-1;++i) {
			ans += Math.min(b[i], b[i-1]);
		}
		ans += b[n-2];
		System.out.println(ans);
	}
}