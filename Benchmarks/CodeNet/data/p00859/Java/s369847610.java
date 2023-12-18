
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	Scanner sc;

	int dfs(int now, boolean[] used, int min, int max, int[][] map) {
		int ret = 0;
		for(int i =0 ; i < map.length; i++){
			if(map[now][i] >= min && map[now][i] <= max){
				if(!used[i]){
					used[i] = true;
					ret += dfs(i,used,min,max,map);
				}
			}
		}

		return ret+1;
	}

	void run() {
		for (;;) {

			int n = sc.nextInt();

			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}

			int map[][] = new int[n][n];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int e = sc.nextInt();

				map[a][b] = e;
				map[b][a] = e;
			}

			int min = 1;
			int max = 1;

			int width = Integer.MAX_VALUE;
			for (;;) {
				if (min > max) {
					max++;
				}
				if (max > 10004) {
					break;
				}

				boolean b[] = new boolean[n];
				b[0] = true;
//				System.out.println(dfs(0, b, min, max, map) +" "+n+ " "+min+" "+max);
				if (dfs(0, b, min, max, map) == n ) {
					width = Math.min(max - min, width);
					min++;
				} else {
					max++;
				}
			}
			if(width > Integer.MAX_VALUE >> 1){
				width = -1;
			}
			System.out.println(width);
		}
	}

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}