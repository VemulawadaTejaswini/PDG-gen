

import java.util.Arrays;
import java.util.Scanner;

/**
 * AOJ id = 2021
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}
	
	private final int MAX = 1000000;

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			int m = sc.nextInt();
			int l = sc.nextInt();
			int k = sc.nextInt();
			int a = sc.nextInt();
			int h = sc.nextInt();
			
			boolean[] cold = new boolean[n];
			cold[a] = cold[h] = true;
			for(int i=0;i<l;i++)
				cold[sc.nextInt()] = true;
				
			int[][] map = new int[n][n];
			for(int i=0;i<n;i++)
				Arrays.fill(map[i], MAX);
			for(int i=0;i<k;i++){
				int ac = sc.nextInt();
				int bc = sc.nextInt();
				int cc = sc.nextInt();
				map[ac][bc] = cc;
				map[bc][ac] = cc;
			}
			
			solve(n, m, cold, k, map, a, h);
		}
	}

	
	public void solve(int n, int m, boolean[] cold, int k, int[][] map, int a, int h) {
		
		for(int kk=0;kk<n;kk++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j] = Math.min(map[i][j], map[i][kk]+map[kk][j]);
				}
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				map[i][j] = (cold[i] && cold[j] && map[i][j]<m )? map[i][j] : MAX;
			}
		}
		for(int kk=0;kk<n;kk++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j] = Math.min(map[i][j], map[i][kk]+map[kk][j]);
				}
			}
		}
		int res = map[a][h]*2-m;
		System.out.println(res >= MAX ? "Help!" : res);
	}

}