import java.util.ArrayDeque;

public class Main {
	private static int h, w, n;
	private static boolean[] wall;
	private static int[] sx, sy;

	private static int[] dx = { 0, 1,  0, -1 };
	private static int[] dy = { 1, 0, -1,  0 };
	
	private static int getInt() throws Exception {
		int i = 0;
		while(true){
			int buf = System.in.read();
			if('0' > buf || buf > '9'){
				break;
			}
			i = i * 10 + buf - '0';
		}
		return i;
	}
	private static int search(int sx, int sy, int ex, int ey) {
		int sc = 0;
		boolean[] visited = new boolean[h*w];
		ArrayDeque<Integer> qx = new ArrayDeque<>();
		ArrayDeque<Integer> qy = new ArrayDeque<>();
		ArrayDeque<Integer> qc = new ArrayDeque<>();
		qx.offer(sx);
		qy.offer(sy);
		qc.offer(sc);
		while(true){
			sx = qx.pop();
			sy = qy.pop();
			sc = qc.pop() + 1;
			for(int i = 0; i < 4; i++){
				int nx = sx + dx[i];
				int ny = sy + dy[i];
				int p = nx + ny*w;
				if(0 <= nx && nx < w && 0 <= ny && ny < h && !wall[p] && !visited[p]){
					if(nx == ex && ey == ny) return sc;
					visited[p] = true;
					qx.offer(nx);
					qy.offer(ny);
					qc.offer(sc);
				}
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		h = getInt();
		w = getInt();
		n = getInt();
		wall = new boolean[h*w];
		sx = new int[10];
		sy = new int[10];
		for(int y = 0; y < h; y++){
			for(int x = 0; x < w; x++) {
				int buf = System.in.read();
				if(buf =='\n' || buf == '\r'){
					x--;
					continue;
				}
				wall[x + y*w] = buf == 'X';
				if(buf == 'S'){
					sx[0] = x;
					sy[0] = y;
				}
				if('1' <= buf && buf <= '9'){
					buf -= '0';
					sx[buf] = x;
					sy[buf] = y;
				}
			}
		}
		int a = 0;
		for(int i = 1; i <= n; i++) a += search(sx[i-1], sy[i-1], sx[i], sy[i]);
		System.out.println(a);
	}

}