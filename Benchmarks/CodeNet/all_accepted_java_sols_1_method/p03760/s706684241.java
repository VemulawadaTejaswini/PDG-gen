import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String str1 = br.readLine();
			for(int i = 0;i < (str.length() + str1.length());i++) {
				if(i%2==0) {
					System.out.print(str.charAt(i/2));
				}else {
					System.out.print(str1.charAt(i/2));
				}
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
