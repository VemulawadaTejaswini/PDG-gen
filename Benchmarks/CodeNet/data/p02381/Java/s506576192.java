import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokuten;
		String line;
		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);
			tokuten = br.readLine().split(" ");

			double ave = 0;
			for (int i = 0; i < n; i++) {
				ave += Integer.parseInt(tokuten[i]);
			}
			ave = ave / n;

			double sd = 0;
			for (int i = 0; i < n; i++) {
				sd += (Math.pow(Integer.parseInt(tokuten[i]) - ave, 2.0)) / n;
			}

			sd = Math.sqrt(sd);
			System.out.println(sd);
		}
	}
}