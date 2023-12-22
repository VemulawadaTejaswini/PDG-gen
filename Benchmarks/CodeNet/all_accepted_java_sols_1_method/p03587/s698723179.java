import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			//int N = Integer.parseInt(str);
			//StringBuilder sb = new StringBuilder();
			int count = 0;
			for(int i = 0;i < str.length();i++) {
				if(str.charAt(i) == '1') {
					count++;
				}
			}
			System.out.println(count);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
