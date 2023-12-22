import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		int t = Integer.parseInt(str[2]);

		int now = 0;
		int time = 0;

		while (n > now) {
			now += x;
			time += t;
		}

		System.out.println(time);
	}
}
