import java.util.*;

// ABC 6-C
// http://abc006.contest.atcoder.jp/tasks/abc006_3
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		String s1 = in.next();
		String s2 = in.next();
		String s3 = in.next();
		
		System.out.printf("%s%s%s\n", s1.substring(0, 1).toUpperCase(), s2.substring(0, 1).toUpperCase(), s3.substring(0, 1).toUpperCase());
	}
	
}