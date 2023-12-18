import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]);
		int h = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);

		double q = (double)w * (double)h / 2.0d;
		int f = 0;
		if ( x*2 == w && y*2 == h ) {
			f = 1;
		}
		System.out.printf("%f %d\n",q,f);
	}
}
