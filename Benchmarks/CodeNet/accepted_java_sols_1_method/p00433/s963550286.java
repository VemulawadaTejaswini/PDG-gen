import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int pa = 0, pb = 0;
		StringTokenizer sta, stb;
		while ((line = br.readLine()) != null) {
			sta = new StringTokenizer(line);
			stb = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++) {
				pa += Integer.parseInt(sta.nextToken());
				pb += Integer.parseInt(stb.nextToken());
			}
			System.out.println(pa > pb ? pa : pb);
		}
	}
}