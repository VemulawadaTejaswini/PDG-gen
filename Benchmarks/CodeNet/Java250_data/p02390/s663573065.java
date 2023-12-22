import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int s = Integer.parseInt(line);
		int h = s / 3600;
		s -= 3600 * h;
		int m = s / 60;
		s -= 60 * m;
		System.out.println(h + ":" + m + ":" + s);
		br.close();
	}
	
}