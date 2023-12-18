
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int OFS = 2;
	int MAX = 10 + OFS * 2;
	int map[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		map = new int[MAX][MAX];
		
		while(sc.hasNext()) {
			String[] str = sc.next().split(",");
			int[] v = new int[3];
			for(int i=0;i<3;i++) v[i] = Integer.parseInt(str[i]);
			if(v[2] == 1) s(v[0]+OFS, v[1]+OFS);
			if(v[2] == 2) m(v[0]+OFS, v[1]+OFS);
			if(v[2] == 3) l(v[0]+OFS, v[1]+OFS);
		}
		int max = 0, cnt = 0;
		for(int i=OFS;i<MAX-OFS;i++) for(int j=OFS;j<MAX-OFS;j++) {
			max = max(max, map[i][j]);
			if(map[i][j] == 0) cnt++;
		}
		System.out.println(cnt);
		System.out.println(max);
	}
	
	void s(int x, int y) {
		map[y][x]++; map[y-1][x]++; map[y][x-1]++; map[y+1][x]++; map[y][x+1]++; 
	}
	void m(int x, int y) {
		for(int i=x-1;i<=x+1;i++) for(int j=y-1;j<=y+1;j++)
			map[j][i]++;
	}
	void l(int x, int y) {
		m(x, y);
		map[y-2][x]++; map[y][x-2]++; map[y+2][x]++; map[y][x+2]++;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}