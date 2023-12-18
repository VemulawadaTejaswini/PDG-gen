import java.util.*;
import java.math.BigInteger;
// warm-up
// Tribute to number 9 huh? As long as i can practice here at Atcoder. Thank you
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger b = BigInteger.ZERO;
		BigInteger NINE = new BigInteger("9");
		for (char ch : sc.next().toCharArray()) b=b.add(new BigInteger(""+ch));
		System.out.println(b.mod(NINE).equals(BigInteger.ZERO) ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
