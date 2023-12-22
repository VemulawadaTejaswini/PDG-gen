import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		String[] strs;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			String line = br.readLine();
			strs = line.split(" ");
		} catch (IOException e) {

			return;
		}
		int p = Integer.parseInt(strs[0]);
		int q = Integer.parseInt(strs[1]);
		int r = Integer.parseInt(strs[2]);

		int minTime = p + q;
		if (minTime > q + r) {

			minTime = q + r;
		}
		if (minTime > r + p) {

			minTime = r + p;
		}
		System.out.println(minTime);
	}
}