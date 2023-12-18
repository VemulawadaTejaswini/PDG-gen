import java.util.*;

public class Main {
	public StringBuffer plus ( String big , String small ) {
		int next = 0;
		String result = "";
		StringBuffer b = new StringBuffer(big) , s = new StringBuffer(small);
		b.reverse(); s.reverse();
		for ( int i = 0; i < b.length(); i++ ) {
			String one = "0" , two = "0";
			if ( !b.substring(i,i+1).equals("") )
				one = b.substring(i,i+1);
			if ( i < s.length() )
				two = s.substring(i,i+1);
			next = next + Integer.parseInt(one) + Integer.parseInt(two);
			if ( next >= 10 ) {
				result += Integer.toString(next - 10);
				next = 1;
			}
			else {
				result += Integer.toString(next);
				next = 0;
			}
		}
		if ( next != 0 ) result += "1";
		if ( result.length() >= 80 ) {
			StringBuffer rtn = new StringBuffer("overflow");
			return rtn;
		} else {
			StringBuffer rs = new StringBuffer(result);
			return rs.reverse();
		}
	}
	
	public static void main ( String args[] ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ ) {
			String big , small;
			String in1 = sc.next();
			String in2 = sc.next();
			if ( in1.length() < in2.length() ) {
				big = in2; small = in1;
			} else {
				big = in1; small = in2;
			}
			System.out.println(m.plus(big, small));
		}
	}
}