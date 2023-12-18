import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int a = parseInt(st.nextToken());
			int b = parseInt(st.nextToken());
			int c = parseInt(st.nextToken());
			int getoff;

			int wake, _wake;

			for (int i = 0; ; i++) {
				wake = (a + b) * i;
				_wake = wake % 60;
				if (_wake <= c && c <= _wake + a) {
					getoff = wake - _wake + c;
					break;
				} else {
					if (60 % (a + b) == 0) {
						getoff = -1;
						break;
					}
				}
			}
			System.out.println(getoff);
		}
	} //end while
} //end main