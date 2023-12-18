import java.util.Scanner;
import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Vector;
import static java.lang.System.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		long x = Math.abs(sc.nextLong());
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ans = 0;
		long temp = x / d;
		if(x < k * d) {
			ans = Math.abs(x - d*temp -d*(Math.abs(k-temp)%2));
		}else {
			ans = x - (k * d);
		}

		
		System.out.println(ans);
	}
	
}

