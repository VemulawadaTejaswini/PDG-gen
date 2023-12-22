import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			str = br.readLine();
			int K = Integer.parseInt(str);

			int res = 1;
			for(int i = 0; i < N; i++) {
				if(res < K) {
					res = res*2;
				}else {
					res += K;
				}
			}
			System.out.println(res);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
