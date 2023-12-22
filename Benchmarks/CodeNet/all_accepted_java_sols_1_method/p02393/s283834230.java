import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a <= b && b <= c) {
			System.out.println(a + " " + b + " " + c);

		} else if(a <= c && c <= b) {
			System.out.println(a + " " + c + " " + b);

		} else if(b <= a && a <= c) {
			System.out.println(b + " " + a + " " + c);

		} else if(b <= c && c <= a) {
			System.out.println(b + " " + c + " " + a);

		} else if(c <= a && a <= b) {
			System.out.println(c + " " + a + " " + b);

		} else if(c <= b && b <= a) {
			System.out.println(c + " " + b + " " + a);
		}
	}
}

