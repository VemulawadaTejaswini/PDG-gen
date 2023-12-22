import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {

	public static void main(String[] args) throws IOException {

		StringBuilder buider = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] n = br.readLine().split(" ");

		System.out.println(new BigInteger(n[0]).gcd(new BigInteger(n[1])));

	}

}