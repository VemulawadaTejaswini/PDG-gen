import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long x = Long.parseLong(br.readLine());

		int time = 0;
		int position = 0;
		while (position < x) {
			time++;
			position = (time * (time + 1)) / 2;
		}
		System.out.println(time);
	}
}
