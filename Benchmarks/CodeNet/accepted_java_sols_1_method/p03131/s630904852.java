import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] inputS = new String[3];
		long k, a, b;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			inputS = br.readLine().split(" ");
			k = Long.parseLong(inputS[0]);
			a = Long.parseLong(inputS[1]);
			b = Long.parseLong(inputS[2]);
		}
		if((b - a) <= 2 || k + 1 <= a) {
			System.out.println(k + 1);
		} else {
			long cookie = (long)1;
			int yen = 0;
			for(long i=0;i<k;i++) {
				if(yen != 0) {
					yen = 0;
					cookie += b;
				} else if(cookie < a || (k - i) < 2) {
					cookie++;
				} else {
					cookie -= a;
					yen = 1;
				}
			}
			System.out.println(cookie);
		}
	}
}