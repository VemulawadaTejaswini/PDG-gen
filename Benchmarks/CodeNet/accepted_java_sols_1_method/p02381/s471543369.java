import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(;;) {
			String line = br.readLine();
			if(line.equals("0")) {
				break;
			}
			int n = Integer.parseInt(line);
			String[] set = br.readLine().split(" ");
			int[] s = new int[n];
			double sum = 0;
			for(int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(set[i]);
				sum += s[i];
			}
			double m = sum / n;
			double a = 0;
			for(int i = 0; i < n; i++) {
				 a += Math.pow(s[i] - m , 2);
			}

			double alpha = Math.sqrt(a / n);

			sb.append(alpha).append("\n");

		}
		System.out.print(sb);
	}
}