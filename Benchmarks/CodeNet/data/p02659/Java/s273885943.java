import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	static BigDecimal A;
	static BigDecimal B;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split(" ");
		A = BigDecimal.valueOf(Double.valueOf(word[0]));
		B = BigDecimal.valueOf(Double.valueOf(word[1]));
		A = A.multiply(B);
		System.out.println(A.longValue());
		br.close();
	}

}
