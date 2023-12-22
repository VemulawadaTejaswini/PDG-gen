import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null) {
			if (line.equals("-1 -1 -1")) {
				break;
			}

			String[] token = line.split(" ");
			int m, f, r, sum;
			m = Integer.parseInt(token[0]);
			f = Integer.parseInt(token[1]);
			r = Integer.parseInt(token[2]);
			sum = m + f;

			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (sum >= 80) {
				System.out.println("A");
			} else if (sum >= 65) {
				System.out.println("B");
			} else if (sum >= 50) {
				System.out.println("C");
			} else if (sum >= 30) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}