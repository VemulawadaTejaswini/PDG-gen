
import java.io.IOException;
import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.next();
			int b = scanner.nextInt();
			if (a.equals("0") && b == 0)
				break;
			BigInteger big = new BigInteger(a).pow(b);
			Deque<String> ans = new LinkedList<String>();
			String an = big.mod(man).toString();
			if (!an.equals("0"))
				ans.push(an);
			big = big.divide(man);
			for (int i = 0; i < 17; i++) {
				an = big.mod(man).toString();
				if (!an.equals("0"))
					ans.push(an + list[i]);
				big = big.divide(man);
			}
			while (!ans.isEmpty()) {
				System.out.print(ans.poll());
			}
			System.out.println();

		}
	}

	BigInteger man = new BigInteger("10000");
	String[] list = { "Man", "Oku", "Cho", "Kei", "Gai", "Jo", "Jou", "Ko",
			"Kan", "Sei", "Sai", "Gok", "Ggs", "Asg", "Nyt", "Fks", "Mts" };
}