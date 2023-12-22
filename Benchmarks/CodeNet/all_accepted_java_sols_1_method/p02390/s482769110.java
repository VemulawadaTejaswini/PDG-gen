import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer buffer = new StringTokenizer(br.readLine());
			int sec = Integer.parseInt(buffer.nextToken());
			
			int h = sec / 3600;
			int m = sec % 3600 / 60;
			int s = sec % 60;
			
			System.out.printf("%d:%d:%d\n",h,m,s);
	}
}
