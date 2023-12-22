import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st;

		while ((st = br.readLine()) != null) {

			String[] str = st.split(" ");

			BigInteger a = new BigInteger(str[0]);

			BigInteger b = new BigInteger(str[1]);

			System.out.println(a.gcd(b) + " " + a.multiply(b).divide(a.gcd(b)));

		}

	}

}