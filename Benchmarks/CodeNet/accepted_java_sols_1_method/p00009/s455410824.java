import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			int count = 0, i, b[] = new int [1000001], j;
			Arrays.fill(b, 1);
			while((s = reader.readLine()) != null) {
				int n = Integer.parseInt(s);
				for(i = 2;i*i <= n;i++) {
					if(b[i] == 0)
						continue;
					for(j = i+i;j <= n;j+=i) {
						b[j] = 0;
					}
				}
				for(int k = 2;k <= n;k++) {
					if(b[k] == 1)
						count++;
				}
				System.out.println(count);
				count = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}