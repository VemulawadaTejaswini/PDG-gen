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
			String[] s = str.split(" ",0);
			int[] ss = new int[N];
			for(int i = 0; i < N;i++) {
				ss[i] = Integer.parseInt(s[i]);
			}
			int total = 0;
			for(int i = 0; i < N;i++) {
				if(ss[ss[i]-1]-1 == i) total++;
			}

			System.out.println(total/2);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
