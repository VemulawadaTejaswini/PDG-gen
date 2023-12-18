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
	
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			if(s.charAt(i) == 'R') {
				ans++;
			}
		}
		if(s.charAt(1) == 'S' && ans == 2) {
			ans = 1;
		}
		System.out.println(ans);
		
	}
	
}

