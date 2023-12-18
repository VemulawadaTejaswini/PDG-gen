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
	
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		int ans = 0;
		Arrays.sort(l);
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j< n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					if(l[i] != l[j] && l[j] != l[k] && l[k] != l[i] && l[i]+l[j] > l[k] && l[j]+l[k] > l[i] && l[k]+l[i] > l[j]) {
						++ans;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
	
}

