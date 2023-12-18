import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		int n = Integer.parseInt(in.readLine());
		int cnt = 0;
		long num = 7;

		if(n % 2 == 0) {
			System.out.println(-1);
			return;
		}
		for(int i=0; i < 100000; i++) {
			cnt++;
			if(i == 0) {
				if(num % n == 0) {
					System.out.println(cnt);
					break;
				}
				continue;
			}
			else{
				num += 7*(long)Math.pow(10, i);
				if(num % n == 0) {
					System.out.println(cnt);
					break;
				}
			}
		}


	}
}