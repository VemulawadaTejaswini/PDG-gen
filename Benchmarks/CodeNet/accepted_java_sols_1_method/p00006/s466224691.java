
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		StringBuffer sb = new StringBuffer(br.readLine());
		System.out.println(sb.reverse().toString());
	}

}