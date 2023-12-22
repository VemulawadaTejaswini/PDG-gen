import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[2];
		int k = 0, x = 0;
		try {
			line = br.readLine();
			in = line.split(" ");
			k = Integer.parseInt(in[0]);
			x = Integer.parseInt(in[1]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int s = x - k + 1;
		if (s < -1000000) s = -1000000;
		
		int f = x + k - 1;
		if (f > 1000000) f = 1000000;
		
		for (int i = s; i < f; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(f);
	}
}