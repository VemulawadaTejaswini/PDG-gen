import java.util.Scanner;

public class Main {
	private Scanner sc;

	int[][] path;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0) break;
			
			int m = Integer.parseInt(sc.nextLine());

			path = new int[m][4];
			for (int i = 0; i < path.length; i++) {
				String[] nico = sc.nextLine().split(",");

				for (int j = 0; j < 3; j++) {
					path[i][j] = Integer.parseInt(nico[j]);
				}
				path[i][2] = path[i][2] / 100 - 1;
				path[i][3] = 0;
			}
			
			
			boolean[] flag = new boolean[n];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = false;
			}
			flag[path[0][0]] = true;
			flag[path[0][1]] = true;
			path[0][3] = 1;
			
			int total = path[0][2];
			
			int marked = 2;
			while (marked != n) {
				for (int i = 1; i < path.length; i++) {
					if (flag[path[i][0]] != flag[path[i][1]]) {
						flag[path[i][0]] = true;
						flag[path[i][1]] = true;
						total = total + path[i][2];
						path[i][3] = 1;
						
						marked++;
					}
				}
			}
			
			for (int i = 0; i < path.length; i++) {
				if (path[i][3] == 0) {
					int max = i;
					
					for (int j = 0; j < path.length; j++) {
						if ((path[j][3] == 0) || (i == j)) continue;
						if ((path[j][0] != path[i][0]) && (path[j][0] != path[i][1])
								&& (path[j][1] != path[i][0]) && (path[j][1] != path[i][1])) continue;
						
						int checknode = -1;
						if ((path[j][0] == path[i][0]) || (path[j][0] == path[i][1])) checknode = path[j][1];
						else checknode = path[j][0];
						
						if ((path[max][2] < path[j][2]) && (check(checknode) >= 2)) max = j;
					}
					
					total = total + path[i][2] - path[max][2];
					path[i][3] = 1;
					path[max][3] = 0;
				}
			}
			
			System.out.println(total);
		}
	}
	
	private int check(int index) {
		int ans = 0;
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (path[i][j] == index) ans++;
			}
		}
		
		return ans;
	}
}