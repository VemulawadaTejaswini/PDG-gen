import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			boolean[][] list = new boolean[n][n+1];
			for(int i = 0; i < n; i++) {
				int m = stdIn.nextInt();
				for(int j = 0; j < m; j++) {
					int p = stdIn.nextInt();
					list[i][p] = true;
				}
			}
			int k = stdIn.nextInt();
			int[] list2 = new int[k];
			for(int i = 0; i < k; i++) {
				list2[i] = stdIn.nextInt();
			}
			int id = -1;
			boolean already = false;
			for(int i = 0; i < n; i++) {
				boolean check = true;
				for(int j = 0; j < k; j++) {
					if(!list[i][list2[j]]) {
						check = false;
						break;
					}
				}
				if(check && !already) {
					id = i+1;
					already = true;
				}
				else if(check && already) {
					id = -1;
					break;
				}
			}
			
			System.out.println(id);
			
			
		}
	}
}