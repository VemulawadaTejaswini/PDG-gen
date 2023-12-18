import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer buffer = new StringTokenizer(br.readLine());
		
		double r =Double.parseDouble(buffer.nextToken());

		System.out.println(String.format("%.5f %.5f", Math.pow(r, 2) * Math.PI, 2 * Math.PI * r));
	}
}
