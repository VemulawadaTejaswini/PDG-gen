import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			char a = s[0].charAt(s[0].length()-1);
			char b = s[1].charAt(0);
			char c = s[1].charAt(s[1].length()-1);
			char d = s[2].charAt(0);
			if(a==b && c == d) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
