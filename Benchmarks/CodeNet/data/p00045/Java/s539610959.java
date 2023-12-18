import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int total = 0, amount = 0, i, p, q;

		i = 0;
		while ((line = br.readLine()) != null) {
			p = Integer.parseInt(line.substring(0, line.indexOf(',')));
			q = Integer.parseInt(line.substring(line.indexOf(',') + 1));
			i++;

			total += p * q;
			amount += q;
		}
		System.out.println(total);
		System.out.println((int) Math.round((double) amount / i));
	}
}