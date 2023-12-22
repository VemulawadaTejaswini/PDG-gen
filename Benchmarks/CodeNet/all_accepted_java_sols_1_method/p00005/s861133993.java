import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] splitedStr;
		List<BigInteger> a = new ArrayList<BigInteger>();
		List<BigInteger> b = new ArrayList<BigInteger>();
		BigInteger gcd;

		while((str = br.readLine()) != null) {
			splitedStr = str.split(" ");
			a.add(new BigInteger(splitedStr[0]));
			b.add(new BigInteger(splitedStr[1]));
		}

		for(int i = 0; i < a.size(); i++) {
			gcd = a.get(i).gcd(b.get(i));
			System.out.print(gcd + " ");
			System.out.println(a.get(i).multiply(b.get(i)).divide(gcd));
		}
	}
}