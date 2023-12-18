import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int ch = sc.nextInt();
			int cw = sc.nextInt();

			int dh = sc.nextInt();
			int dw = sc.nextInt();

			int[][] maze = new int[h+4][w+4];

			for(int i = 0 ; i < h+4 ; i++ ) {
				maze[i][0] = -1;
				maze[i][1] = -1;
				maze[i][w+2] = -1;
				maze[i][w+3] = -1;
			}
			for(int j = 0 ; j < w+4 ; j++ ) {
				maze[0][j] = -1;
				maze[1][j] = -1;
				maze[h+2][j] = -1;
				maze[h+3][j] = -1;
			}

			for(int i = 0 ; i < h ; i++ ) {
				String s = sc.next();
				for(int j = 0 ; j < w ; j++ ) {

					int val = 0;
					if ( s.charAt(j) == '#' ) {
						val = -1;
					}

					maze[i+2][j+2] = val;
				}
			}
			
//			dispMaze(maze, h, w);

			paint(maze, ch+1, cw+1, 1, h, w);

//			dispMaze(maze, h, w);
			
			if ( maze[dh+1][dw+1] == 0 ) {
				System.out.println(-1);
			}
			else {
				System.out.println(maze[dh+1][dw+1] - 1);
			}


		}
	}

	public static void paint(int[][] maze, int y, int x, int areaNo, int h, int w) {		
		Queue<Position> walkqueue = new LinkedList<>();
		Queue<Position> warpqueue = new LinkedList<>();

		walkqueue.add(new Position(x, y, areaNo));

		while( walkqueue.size() > 0 || warpqueue.size() > 0) {

			while (walkqueue.size() > 0 ) {
				Position pos = walkqueue.remove();

				int px = pos.x;
				int py = pos.y;

				if ( maze[py][px] != 0 ) {
					continue;
				}

				maze[py][px] = pos.areaNo;
				//			dispMaze(maze, h, w);

				if (maze[py-1][px] == 0 ) {
					walkqueue.add(new Position(px, py-1, pos.areaNo));
				}
				if (maze[py+1][px] == 0 ) {
					walkqueue.add(new Position(px, py+1, pos.areaNo));
				}
				if (maze[py][px-1] == 0 ) {
					walkqueue.add(new Position(px-1, py, pos.areaNo));
				}
				if (maze[py][px+1] == 0 ) {
					walkqueue.add(new Position(px+1, py, pos.areaNo));
				}		
				for(int i = -2 ; i < 3 ; i++ ) {
					for(int j = -2 ; j < 3 ; j++ ) {
//						System.out.println(String.format("px: %d, py:%d, i:%d,j:%d", px,py,i,j));
						if ( maze[py+i][px+j] == 0  ) {
							
							warpqueue.add(new Position(px+j, py+i, pos.areaNo + 1));
						}
					}
				}
			}
			
			while( warpqueue.size() > 0 ) {
				Position pos = warpqueue.remove();
				if ( maze[pos.y][pos.x] == 0) {
					walkqueue.add(pos);
					break;
				}
			}

		}
	}

	public static void dispMaze(int[][] maze, int h, int w) {
		for(int i = 0 ; i < h + 4 ; i++ ) {
			for(int j = 0 ; j < w + 4 ; j++ ) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}

	public static class Position {

		public Position(int x, int y, int areaNo) {
			this.x = x;
			this.y = y;
			this.areaNo = areaNo;
		}
		public int x;
		public int y;
		public int areaNo;
	}

}