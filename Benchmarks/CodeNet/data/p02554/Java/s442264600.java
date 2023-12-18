import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		int N = Integer.parseInt(args[0].split(" ")[0]);
		System.out.println(bd(10).pow(N).subtract(bd(9).pow(N).multiply(bd(2))).add(bd(8).pow(N)).remainder(bd(10).pow(9).add(bd(7))));
	}

	BigDecimal bd(int n) {
		return new BigDecimal(String.valueOf(n));
	}

}
