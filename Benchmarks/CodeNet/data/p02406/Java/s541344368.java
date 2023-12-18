import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			long val = Long.parseLong(br.readLine());
			for (int i = 1; i <= val; i++) {
				if (i % 3 == 0 || i % 10 == 3)
					sb.append(" "+i);
			}
			System.out.println(sb);
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}