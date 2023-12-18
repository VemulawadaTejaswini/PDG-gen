import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int second = Integer.parseInt(reader.readLine());
		if (second >= 0 && second < 86400) {
			int hh = second / 3600;
			int mm = (second % 3600) / 60;
			int ss = second % 60;
			System.out.println(hh + ":" + mm + ":" + ss);
		}
	}
}