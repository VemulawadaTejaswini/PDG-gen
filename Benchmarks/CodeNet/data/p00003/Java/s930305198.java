/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.util.Arrays.*;

public class Main {
	static int n;
	static int[] edges = new int[3];
	static Scanner sc = new Scanner(System.in);
	
	static void read() {
		for(int i = 0; i < 3; i++) {
			edges[i] = sc.nextInt();
		}
	}
	
	static String solve() {
		sort(edges);
		int a,b,c;
		a = edges[0]; b = edges[1]; c = edges[2];
		if((a * a + b * b) == (c * c)) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		while(n-- > 0) {
			read();
			System.out.println(solve());
		}
	}
}