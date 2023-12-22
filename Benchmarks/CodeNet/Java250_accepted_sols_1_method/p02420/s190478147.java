import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(!(str = br.readLine()).equals("-")){
			StringBuilder sb = new StringBuilder(str);
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int h = Integer.parseInt(br.readLine());
				sb.append(sb.toString().substring(0, h));
				sb.delete(0, h);
			}
			System.out.println(sb.toString());
		}
	}

}