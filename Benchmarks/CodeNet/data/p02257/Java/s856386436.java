import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		
		boolean[] prime = new boolean[100000001];
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i < prime.length; i++) {
			int j = 2;
			for (j = 2; i * j < prime.length; j++) {
				prime[i * j] = false;
			}
			if (i * i > prime.length) break;
		}
		
		try {
			int lim = Integer.parseInt(in.readLine());
			
			int ans = 0;
			for (int i = 0; i < lim; i++) {
				x = in.readLine();
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