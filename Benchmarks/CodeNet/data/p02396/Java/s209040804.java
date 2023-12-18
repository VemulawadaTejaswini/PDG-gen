import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int cnt = 1;

		for(;;) {
			String num = br.readLine();
			if (num.equals("0")) {
				break;
			}
			sb.append("Case ").append(cnt++).append(": ").append(num).append("\n");
		}
		System.out.print(sb);
	}

}