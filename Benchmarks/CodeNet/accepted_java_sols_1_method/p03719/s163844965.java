import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println(a <= c && c <= b ? "Yes" : "No");
	}
}