import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] str;
		String line;
		int w,h,sx,sy,gx,gy,n;
		Block b;
		
		while(true){
			line = sc.nextLine();
			str = line.split(" ");
			if(str[0].equals("0") && str[1].equals("0")){
				break;
			}
			w = Integer.valueOf(str[0]);
			h = Integer.valueOf(str[1]);
			line = sc.nextLine();
			str = line.split(" ");
			sx = Integer.valueOf(str[0]);
			sy = Integer.valueOf(str[1]);
			line = sc.nextLine();
			str = line.split(" ");
			gx = Integer.valueOf(str[0]);
			gy = Integer.valueOf(str[1]);
			b = new Block(w,h,sx,sy,gx,gy);
			
			line = sc.nextLine();
			n = Integer.valueOf(line);
			
			for(int i=0;i<n;i++){
				b.setBlock(sc.nextLine());
			}
			
			if(b.getResult()){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}
}

class Block{
	int[][] board;
	int w,h,sx,sy,gx,gy,c;
	
	Block(int w,int h,int sx,int sy,int gx,int gy){
		this.w = w;
		this.h = h;
		board = new int[w+1][h+1];
		this.sx = sx;
		this.sy = sy;
		this.gx = gx;
		this.gy = gy;
	}
	
	public boolean getResult(){
		c = board[sx][sy];
		
		return checkRoute(c,sx,sy);
	}
	
	private boolean checkRoute(int c,int x,int y){
		boolean result = false;
		
		if((x==gx) && (y==gy)){
			return true;
		}
		
		board[x][y] = -1;
		if(x-1 > 0){
			if(board[x-1][y] == c){
				result = checkRoute(c,x-1,y);
			}
		}
		
		if(x+1 < w+1){
			if(board[x+1][y] == c){
				result = checkRoute(c,x+1,y);
			}
		}
		
		if(y-1 > 0){
			if(board[x][y-1] == c){
				result = checkRoute(c,x,y-1);
			}
		}
		
		if(y+1 < h+1){
			if(board[x][y+1] == c){
				result = checkRoute(c,x,y+1);
			}
		}
		
		return result;
	}
	
	public void setBlock(String line){
		String[] str = line.split(" ");
		int c,d,x,y;
		c = Integer.valueOf(str[0]);
		d = Integer.valueOf(str[1]);
		x = Integer.valueOf(str[2]);
		y = Integer.valueOf(str[3]);
		if(d == 0){
			for(int i=0;i<2;i++){
				for(int j=0;j<4;j++){
					board[y+i][x+j] = c;
				}
			}
		}else{
			for(int i=0;i<4;i++){
				for(int j=0;j<2;j++){
					board[y+i][x+j] = c;
				}
			}
		}
	}
}