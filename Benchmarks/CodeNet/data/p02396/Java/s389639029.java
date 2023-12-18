import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int times = 1;
			while(true) {
				String str = br.readLine();
				int n = Integer.parseInt(str);
				System.out.println("Case " + times + ": " + n);
				if (n == 0) {
					break;
				}
				times++;
			}
	}