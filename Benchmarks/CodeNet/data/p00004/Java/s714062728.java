import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			float a = Float.parseFloat(st.nextToken());
			float b = Float.parseFloat(st.nextToken());
			float c = Float.parseFloat(st.nextToken());
			float d = Float.parseFloat(st.nextToken());
			float e = Float.parseFloat(st.nextToken());
			float f = Float.parseFloat(st.nextToken());
			float y = (c*d - f*a) / (b*d - a*e);
			float x = (c - b*y) / a;
			System.out.println(String.format("%.3f %.3f", x, y));
		}
		reader.close();
	}
}
