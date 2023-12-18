import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

public class Main {
	static int n;
	static int k;
	static String[] a;
	static boolean[] used;
	static Set<String> set;
 	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			n = scanner.nextInt();
			k = scanner.nextInt();
			if(n == 0 && k == 0) break;
			a = new String[n];
			for(int i = 0; i < n; i++){
				a[i] = scanner.next();
			}
			used = new boolean[n];
			for(int i = 0; i < n; i++){
				used[i] = false;
			}
			set = new HashSet<String>();
			dfs("", 0);
			System.out.println(set.size());
		}
		return;
	}
	public static void dfs(String s, int count){
		if(count == k){
			set.add(s);
			return;
		}
		for(int i = 0; i < n; i++){
			if(used[i]) continue;
			used[i] = true;
			dfs(s+a[i], count+1);
			used[i] = false;
		}
	}
}

