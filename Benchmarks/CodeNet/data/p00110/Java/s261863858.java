/**
 * @author yuichirw
 *
 */
import java.math.BigInteger;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	
	static boolean read() {
		if(!sc.hasNext()) return false;
		line = sc.next();
		return true;
	}
	
	static String solve() {
		BigInteger a,b,c;
		for(int i = 0; i <= 9; i++) {
			String expr = line.replaceAll("X", "" + (char)(i + '0'));
			String[] parse1 = expr.split("=");
			String[] parse2 = parse1[0].split("\\+");
			a = new BigInteger(parse2[0]);
			b = new BigInteger(parse2[1]);
			c = new BigInteger(parse1[1]);
			if(a.add(b).equals(c)) {
				return "" + i;
			}
		}
		return "NA";
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}