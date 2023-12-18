import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] blue = new String[n];
		for (int i = 0; i < blue.length; i++) {
			blue[i] = br.readLine();
		}
		int m = Integer.parseInt(br.readLine());
		String[] red = new String[m];
		for (int i = 0; i < red.length; i++) {
			red[i] = br.readLine();
		}

		int maxv = 0;
		for (String s : blue) {
			int cnt = 0;
			for (int i = 0; i < blue.length; i++) {
				if (s.equals(blue[i])) {
					cnt++;
				}
			}
			for (int j = 0; j < red.length; j++) {
				if (s.equals(red[j])) {
					cnt--;
				}
			}
			maxv = Math.max(maxv, cnt);
		}
		System.out.println(maxv);
	}
}
