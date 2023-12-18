import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		StringBuilder sb;
		int start, time;

		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line);
			sb = new StringBuilder();
			start = time = 0;
			start = Integer.parseInt(st.nextToken());
			time -= Integer.parseInt(st.nextToken()) * 60;
			time -= Integer.parseInt(st.nextToken());
			time += (Integer.parseInt(st.nextToken()) - start) * 3600;
			time += Integer.parseInt(st.nextToken()) * 60;
			time += Integer.parseInt(st.nextToken());
			sb.append((time / 3600) + " ");
			time %= 3600;
			sb.append((time / 60) + " ");
			time %= 60;
			sb.append(time);
			System.out.println(sb.toString());
		}
	}
}