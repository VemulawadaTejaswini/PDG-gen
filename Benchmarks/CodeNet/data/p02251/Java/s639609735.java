import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		reader.close();
		
		final int[] coins = {25,10,5,1};
		int ans = 0;
		int remain = n;
		
		for (int coin : coins) {
			int tmp = remain / coin;
			ans += tmp;
			remain -= coin * tmp;
		}
		System.out.println(ans);
	}
}
