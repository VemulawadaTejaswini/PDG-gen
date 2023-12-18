import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		
		boolean[] prime = new boolean[10001];
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i < 10001; i++) {
			for (int j = 2; (j * j) < i; j++) {
				if (prime[i] == false) continue;
				if ((i % j) == 0) {
					prime[i] = false;
					break;
				}
			}
		}
		
		try {
			int ans = 0;
			while ((x = in.readLine()) != null) {
				int num = Integer.parseInt(x);
				if (prime[num] == true) ans++;
			}
			System.out.println(ans);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}