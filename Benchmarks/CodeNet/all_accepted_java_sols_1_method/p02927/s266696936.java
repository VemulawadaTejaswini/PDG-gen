
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int m,d,ans = 0;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		m = Integer.parseInt(s[0]);
		d = Integer.parseInt(s[1]);
		if(d >= 22) {
			int d1 = d/10;
			int d2 = d%10;
			for(int i = 2;i <= d1;++i) {
				if(i != d1) {
					for(int j = 2;j <= 9;++j) {
						if(i*j <= m){
							ans++;
						}
					}
				} else {
					for(int j = 2;j <= d2;++j) {
						if(i*j <= m) {
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}