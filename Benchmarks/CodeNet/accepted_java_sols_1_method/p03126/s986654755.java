import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] disliked = new boolean[m];
		
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			Set<Integer> isLiked = new HashSet<Integer>();
			for(int j = 0; j < k; j++) {
				int a = sc.nextInt() - 1;
				isLiked.add(a);
			}
			for(int j = 0; j < m; j++) {
				if(!isLiked.contains(j)) {
					disliked[j] = true;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < m; i++) {
			if(!disliked[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

