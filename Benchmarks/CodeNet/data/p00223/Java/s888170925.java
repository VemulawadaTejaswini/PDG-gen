import java.util.*;
public class Main {

	int x;
	int y;
	int [][] block;

	class C {
		int x1;
		int y1;
		int x2;
		int y2;
		int count;
		public C(int x1, int y1, int x2, int y2, int count) {
			super();
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.count = count;
		}
	}

	private boolean isBlock(int x1, int y1){
		if(block[y1][x1] == 1)
			return true;
		else
			return false;
	}

	private boolean isOut(int x1, int y1){
		if(x1 <= 0 || x1 > x || y1 <= 0 || y1 > y )
			return true;
		return false;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			LinkedList<C>open  = new LinkedList<C>();
			boolean[][][][] close = new boolean [x+1][y+1][x+1][y+1];
			int [] xdir = {0,1,0,-1};
			int [] ydir = {1,0,-1,0};
			int tx = sc.nextInt();
			int ty  = sc.nextInt();
			int kx = sc.nextInt();
			int ky  = sc.nextInt();
			block = new int [y+1][x+1];
			for(int i=1; i <= y; i++){
				for(int j=1; j <= x; j++){
					block[i][j] = sc.nextInt();
				}
			}

			//set a first
			open.add(new C(tx, ty, kx, ky,0));

			close[tx][ty][kx][ky] = true;
			boolean flg = false;

			while(!open.isEmpty()){
				C temp = open.getFirst();
				open.removeFirst();
				int x1 = temp.x1;
				int y1 = temp.y1;
				int x2 = temp.x2;
				int y2 = temp.y2;
				int c = temp.count;
				//goal
				if(x1 == x2 && y1 == y2){
					flg = true;
					System.out.println(c);
					break;
				}
				for(int i=0; i < 4; i++){
					int temp1 = x1 + xdir[i];
					int temp2 = y1 + ydir[i];
					int temp3 = x2 + xdir[i] * -1;
					int temp4 = y2 + ydir[i] * -1;
					if(isOut(temp1, temp2) || isBlock(temp1, temp2)){
						temp1 = x1;
						temp2 = y1;
					}
					if(isOut(temp3, temp4) || isBlock(temp3, temp4)){
						temp3 = x2;
						temp4 = y2;
					}
					if( ! close[temp1][temp2][temp3][temp4]){
						open.addLast(new C(temp1,temp2,temp3,temp4,c + 1));
						close[temp1][temp2][temp3][temp4] = true;
					}
				}
			}
			if(!flg) System.out.println("NA");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}