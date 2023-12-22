import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int a,b;
		String buf = br.readLine();
		StringTokenizer st= new StringTokenizer(buf, " ");

		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());


		System.out.println(a*b + " " + 2*(a+b));


	}
}