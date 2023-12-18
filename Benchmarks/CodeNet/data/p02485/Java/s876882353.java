import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String [] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				String str = br.readLine();
				if(str == "0")
					break;
				
				int ans = 0;
				for(int i = 0; i < str.length(); i++) {
					ans += str.charAt(i)-'0';
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}