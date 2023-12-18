import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String line = br.readLine();
		int answer = Integer.parseInt(line);
		while(true) {
			String operator = br.readLine();

			if(operator.equals("="))break;

			line = br.readLine();
			int val = Integer.parseInt(line);
			if(operator.equals("+")) {
				answer += val;
			}else if (operator.equals("-")) {
				answer -= val;
			}else if (operator.equals("*")) {
				answer *= val;
			}else if (operator.equals("/")) {
				answer /= val;
			}
		}

		System.out.println(answer);
	}
}

