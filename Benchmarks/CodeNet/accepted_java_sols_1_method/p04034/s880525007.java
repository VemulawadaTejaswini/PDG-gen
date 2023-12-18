import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		int[] count = new int[n+1];
		for(int i=1; i<=n; i++) count[i] = 1;

		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(set.contains(x)) set.add(y);
			count[x] --;
			count[y] ++;
			if(count[x]==0) set.remove(x);
		}
		System.out.println(set.size());
	}
}