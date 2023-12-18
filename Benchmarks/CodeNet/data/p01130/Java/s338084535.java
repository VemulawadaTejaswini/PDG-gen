
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n,m;
	int p[];
	int[][] map;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			map = new int[n][n];
			p = new int[3];
			for(int i=0;i<3;i++) p[i] = sc.nextInt();
			if( (n|m|p[0]|p[1]|p[2]) == 0 ) break;
			for(int[] a: map) fill(a, INF);
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				map[a][b] = map[b][a] = c;
			}
			for(int k=0;k<n;k++) for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
				map[i][j] = min(map[i][j], map[i][k] + map[k][j]);
			}
			int min = INF;
			for(int i=0;i<n;i++) {
				int sum = 0;
				for(int j=0;j<3;j++) sum += map[i][p[j]-1];
				min = min(min, sum);
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}