import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int weeks = Integer.parseInt(str);
			int debt = 100000;
			for(int i = 0; i < weeks; i++){
				debt = new BigDecimal(debt * 1.05).setScale(-3, BigDecimal.ROUND_CEILING).intValueExact();
			}
					System.out.println(debt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}