import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		int time = Integer.parseInt(buf);
		int h = time / 60 / 60;
		time -= h * 60 *60;
		int m = time /60 ;
		int s = time -= m * 60;


		System.out.println(h + ":" + m + ":" + s );
	}
}