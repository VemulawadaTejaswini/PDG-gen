import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int R = Integer.parseInt(str);
			str = br.readLine();
			int G = Integer.parseInt(str);
			System.out.println(2*G - R);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
