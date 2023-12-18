import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		boolean[][] rooml = new boolean[50][50];
		boolean[][] roomr = new boolean[50][50];
		boolean[][][][] used = new boolean[50][50][50][50]; 
		int dlx, dly, drx, dry, lx, ly, rx, ry;
		dlx = dly = drx = dry = lx = ly = rx = ry = 0;
		Queue<Integer> quelx = new LinkedList<Integer>();
		Queue<Integer> quely = new LinkedList<Integer>();
		Queue<Integer> querx = new LinkedList<Integer>();
		Queue<Integer> query = new LinkedList<Integer>();
		int[] dilx = {1, -1, 0, 0};
		int[] dily = {0, 0, 1, -1};
		int[] dirx = {1, -1, 0, 0};
		int[] diry = {0, 0, -1, 1};
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt();
			if (w == 0 && h == 0) break;
			for (int i = 0; i < h; i++) {
				String l = sc.next(), r = sc.next();
				for (int j = 0; j < w; j++) {
					switch (l.charAt(j)) {
					case '.': rooml[i][j] = true; break;
					case '#': rooml[i][j] = false; break;
					case '%': 
						rooml[i][j] = true;
						dlx = i; dly = j;
						break;
					case 'L':
						rooml[i][j] = true;
						lx = i;
						ly = j;
						break;
					}
					switch (r.charAt(j)) {
					case '.': roomr[i][j] = true; break;
					case '#': roomr[i][j] = false; break;
					case '%': 
						roomr[i][j] = true;
						drx = i; dry = j;
						break;
					case 'R':
						roomr[i][j] = true;
						rx = i;
						ry = j;
						break;
					}
				}
			}
			
			quelx.clear(); quely.clear();
			querx.clear(); query.clear();
			for (int i = 0; i < 50; i++)
				for (int j = 0; j < 50; j++)
					for (int k = 0; k < 50; k++)
						Arrays.fill(used[i][j][k], false);
			quelx.add(lx); quely.add(ly);
			querx.add(rx); query.add(ry);
			used[lx][ly][rx][ry] = true;
			boolean flag = false;
			while (!quelx.isEmpty()) {
				int telx = quelx.poll(), tely = quely.poll();
				int terx = querx.poll(), tery = query.poll();
				if (telx == dlx && tely == dly && terx == drx && tery == dry) {
					flag = true;
					break;
				}
				if (telx == dlx && tely == dly && !(terx == drx && tery == dry)) {
					continue;
				}
				if (!(telx == dlx && tely == dly) && terx == drx && tery == dry) continue;
				for (int i = 0; i < 4; i++) {
					int lX = telx + dilx[i], lY = tely + dily[i];
					int rX = terx + dirx[i], rY = tery + diry[i];
					if (!(0 <= lX && lX < h && 0 <= lY && lY < w && rooml[lX][lY])) {
						lX = telx;
						lY = tely;
					}
					if (!(0 <= rX && rX < h && 0 <= rY && rY < w && roomr[rX][rY])) {
						rX = terx;
						rY = tery;
					}
					if (!used[lX][lY][rX][rY]) {
						used[lX][lY][rX][rY] = true;
						quelx.add(lX); quely.add(lY);
						querx.add(rX); query.add(rY);
					}
				}
			}
			
			if (flag)
				out.println("Yes");
			else
				out.println("No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}