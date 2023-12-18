import java.util.Scanner;

public class Main {
	static String[][] area;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) break;
			area = new String[H][W];
			for(int i = 0; i < H; i++){
				String s = sc.next();
				for(int j = 0; j < W; j++){
					area[i][j] = s.substring(j, j+1);
				}
			}
			move(0,0);
		}
	}
	
	public static void move(int x,int y){
		if(area[x][y].equals(">")){
			area[x][y] = "*";
			move(x,y+1);
		}else if(area[x][y].equals("<")){
			area[x][y] = "*";
			move(x,y-1);
		}else if(area[x][y].equals("^")){
			area[x][y] = "*";
			move(x-1,y);
		}else if(area[x][y].equals("v")){
			area[x][y] = "*";
			move(x+1,y);
		}else if(area[x][y].equals(".")){
			System.out.println(y + " " + x);
		}else if(area[x][y].equals("*")){
			System.out.println("LOOP");
		}else{
			System.out.println(area[x][y]);
			System.err.println("error");
		}
	}
}