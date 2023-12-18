import java.util.*;

// ABC 85-D
// https://beta.atcoder.jp/contests/abc085/tasks/abc085_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		int diff = Math.abs(A - B);
		System.out.println(diff % 2 == 0 ? "Alice" : "Borys");
	}
}
