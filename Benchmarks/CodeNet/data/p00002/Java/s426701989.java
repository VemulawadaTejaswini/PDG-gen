import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		String str = "";
		StringTokenizer st;
		int num = 0;
		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			str = String.valueOf(num);
			System.out.println(str.length());
		}
	}
}