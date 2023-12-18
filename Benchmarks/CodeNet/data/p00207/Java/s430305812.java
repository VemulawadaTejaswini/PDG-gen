//Volume2-0207
import java.util.ArrayDeque;
import java.util.Scanner;

class Cell {
	public int x,y;
	Cell(int x,int y){
		this.x=x; this.y=y;
	}
}

class Main {

	private static final int              MARK      = 9;
	private static       int	          w,h,color;
	private static final int[][]          chk       = {{-1,0},{0,-1},{1,0},{0,1}};
	private static       int[][]          board;
	private static       ArrayDeque<Cell> q         = new ArrayDeque<Cell>();

	public static void main(String[] args){

		int xs,ys,xg,yg,n;
		String result;

		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0){break;}
			result = "";
			board = new int[h][w];
			xs = sc.nextInt()-1; ys = sc.nextInt()-1;
			xg = sc.nextInt()-1; yg = sc.nextInt()-1;
			n  = sc.nextInt();
			for(int i=0;i<n;i++){
				paint(sc.nextInt(),sc.nextInt(),sc.nextInt()-1,sc.nextInt()-1);
			}
			if   (search(xs,ys,xg,yg)){result = "OK";}
			else                      {result = "NG";}
			System.out.println(result);
		}
	}

	private static void paint(int c,int d,int x,int y){
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
				if(d==1){
					board[y+i][x+j] = c;
				} else {
					board[y+j][x+i] = c;
				}
			}
		}
	}

	private static boolean search(int xs,int ys,int xg,int yg){

		boolean ret = false;

		color = board[ys][xs];
		q.clear();
		q.add(new Cell(xs,ys));

		while(!q.isEmpty()){
			Cell cl = q.poll();
			if(cl.x==xg&&cl.y==yg){
				ret = true;
				break;
			}else {
				board[cl.y][cl.x] = MARK;
				setAroundCell(cl);
			}
		}
		return ret;
	}

	private static void setAroundCell(Cell cl){
		int x,y;
		for(int i=0;i<4;i++){
			x = cl.x+chk[i][0];
			y = cl.y+chk[i][1];
			if(0 <= y && y < h && 0 <= x && x < w){
				if(board[y][x] == color){
					q.add(new Cell(x,y));
				}
			}
		}
	}
}