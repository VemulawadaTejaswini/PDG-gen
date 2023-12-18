import java.util.*;

public class Main {

	static String expr;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		if(!sc.hasNextLine()) return false;
		expr = sc.nextLine();
		return true;
	}
	
	static String solve() {
		String ans = "NA", a,b,c,problem;
		int d, e;
		String[] parsed;
		for(int i = 0; i <= 9; i++) {
			problem = expr.replaceAll("X", new Integer(i).toString());
			parsed = problem.split("=");
			c = parsed[1];
			parsed = parsed[0].split("\\+");
			a = parsed[0]; b = parsed[1];
			if(a.charAt(0) == '0' || b.charAt(0) == '0' || c.charAt(0) == '0') continue;
			d = Integer.parseInt(a) + Integer.parseInt(b); e = Integer.parseInt(c);
			if(d == e) {
				ans = "" + i;
				break;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}