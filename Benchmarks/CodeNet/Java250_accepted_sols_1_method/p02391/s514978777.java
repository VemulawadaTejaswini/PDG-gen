import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer buffer = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(buffer.nextToken());
			int b = Integer.parseInt(buffer.nextToken());
			
			String op = "a == b";
			if(a > b) {
				op = "a > b";
			}else if (a < b) {
				op = "a < b";
			}
			
			System.out.println(op);
	}
}
