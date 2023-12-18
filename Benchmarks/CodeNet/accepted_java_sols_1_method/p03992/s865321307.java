import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder ();
			for(int i = 0; i < str.length();i++) {
				sb.append(str.charAt(i));
				if(i == 3) sb.append(" ");
			}

			System.out.println(sb);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
