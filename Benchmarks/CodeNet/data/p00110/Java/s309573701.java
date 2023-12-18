
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String formula = sc.nextLine();
			String[] str = formula.split("[ + = ]");
			boolean f = true;
			for(String s: str) f = !(s.length() != 1 && s.charAt(0) == '0');
			int i=0;
			for(i=f? 0: 1;i<10;i++) {
				if(isequal(formula, i)) break;
			}
			System.out.println((i==10? "NA": i));
		}
	}
	
	boolean isequal(String formula, int i) {
		String[] s = formula.replace('X', (char) (i+'0')).split("[ + = ]");
		BigInteger v1 = new BigInteger(s[0]);
		BigInteger v2 = new BigInteger(s[1]);
		BigInteger v3 = new BigInteger(s[2]);
		
		return v1.add(v2).compareTo(v3) == 0;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}