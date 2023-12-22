
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,i,ans,temp = 0;
		String str;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		for(i = 0;i < n;++i) {
			if(str.charAt(i) == '.') {
				temp++;
			}
		}
		ans = temp;
		for(i = 0;i < n;++i) {
			if(str.charAt(i) == '.') {
				temp--;
			} else {
				temp++;
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}
}