import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static int[] dx = new int[]{-1,0,1,0},dy = new int[]{0,-1,0,1};

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		MainLoop : while(true){
			int w = Integer.parseInt(scan.next());
			int h = Integer.parseInt(scan.next());
			if(w==0) break;
			byte[][] map = new byte[h][w];

			int sx = Integer.parseInt(scan.next())-1;
			int sy = Integer.parseInt(scan.next())-1;
			int gx = Integer.parseInt(scan.next())-1;
			int gy = Integer.parseInt(scan.next())-1;
			int n = Integer.parseInt(scan.next());
			for (int i = 0; i < n; i++) {
				byte c = scan.nextByte();
				int d = Integer.parseInt(scan.next());
				int x = Integer.parseInt(scan.next())-1;
				int y = Integer.parseInt(scan.next())-1;
				for (int j = 0; j < (d==0 ? 2 : 4) ; j++)
					for (int j2 = 0; j2 < (d==0 ? 4 : 2) ; j2++)
						map[j+y][j2+x] = c;

			}

			if(map[sy][sx]==0){
				out.println("NG");
				continue;
			}
			int color = map[sy][sx];
			Stack<int[]> stk = new Stack<int[]>();
			stk.push(new int[]{sx,sy});

			while(!stk.isEmpty()){
				int[] pos = stk.pop();
				map[pos[1]][pos[0]]=0;
				if(pos[0]==gx && pos[1]==gy){
					out.println("OK");
					continue MainLoop;
				}

				for (int i = 0; i < 4; i++) {
					int nx = pos[0]+dx[i],ny = pos[1]+dy[i];
					if(nx>=0 && nx<w && ny>=0 && ny<h && color==map[ny][nx])
						stk.push(new int[]{nx,ny});
				}
			}
			out.println("NG");
		}

		out.flush();
	}
}