
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,n,temp = 0,temph,h;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		s = str.split(" ");
		h = Integer.parseInt(s[0]);
		for(int i = 1;i < n;++i) {
			temph = Integer.parseInt(s[i]);
			if(h >= temph) {
				temp++;
			} else {
				if(ans < temp) {
					ans = temp;
				}
				temp = 0;
			}
			h = temph;
		}
		if(ans < temp) {
			ans = temp;
		}
		System.out.println(ans);
	}
}