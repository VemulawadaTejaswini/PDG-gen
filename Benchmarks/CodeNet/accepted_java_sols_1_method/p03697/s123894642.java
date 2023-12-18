import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt() + in.nextInt();
		System.out.println(n >= 10 ? "error" : n);
	}
}