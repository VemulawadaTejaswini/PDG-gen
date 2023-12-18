import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		String x = st.nextToken();
		String y = st.nextToken();
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);

		int c = a*b;
		int d = 2*a + 2*b;
		System.out.print(c);
		System.out.print(" ");
		System.out.println(d);
	}
}