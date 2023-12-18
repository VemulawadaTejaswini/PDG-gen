import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				String str = br.readLine();
				int N = Integer.parseInt(str);
				if(N == 0) break;
				int a = 0;
				int b = 0;
				for(int i = 0; i < N;i++) {
					str = br.readLine();
					String[] s = str.split(" ", 0);
					int aa = Integer.parseInt(s[0]);
					int bb = Integer.parseInt(s[1]);
					if(aa > bb) {
						a += (aa + bb);
					}else if (aa < bb) {
						b += (aa + bb);
					}else {
						a += aa;
						b += bb;
					}
				}
				System.out.println(a+" "+b);
			}

		}catch (Exception e) {
			System.exit(0);
		}
	}
}