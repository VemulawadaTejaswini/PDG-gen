import java.util.*;
public class Main {
	int [][] field;
	int goalx;
	int goaly;
	int moveColor;

	private boolean move(int x, int y){

		if(field[y][x] != moveColor){
			return false;
		}
		if(x == goalx && y == goaly){
			return true;
		}

		field[y][x] = -1;
		if(move(x+1,y) || move(x-1,y) || move(x,y+1) || move(x,y-1))
			return true;
		else
			return false;

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			field = new int[h+2][w+2];
			int xs = sc.nextInt();
			int ys = sc.nextInt();
			goalx = sc.nextInt();
			goaly = sc.nextInt();
			int n = sc.nextInt();

			//read a block
			int [][] block = new int[n][4];
			for(int i=0; i < n; i++){
				for(int j=0; j < 4; j++){
					block[i][j] = sc.nextInt();
				}
				int x = block[i][2];
				int y = block[i][3];
				if(block[i][1] == 0){
					for(int k=y; k < y+2; k++ ){
						for(int j=x; j < x+4; j++){
							field[k][j] = block[i][0];
						}
					}
				}
				else{
					for(int k=y; k < y+4; k++ ){
						for(int j=x; j < x+2; j++){
							field[k][j] = block[i][0];
						}
					}
				}
			}

			//set flame
			for(int i=0; i <= w + 1; i++){
				field[0][i] = -1;
				field[h+1][i] = -1;
				field[i][0] = -1;
				field[i][w+1] = -1;
			}

			//start
			moveColor = field[ys][xs];
			if(moveColor == 0){
				System.out.println("NG");
				return;
			}
			boolean ans = move(xs, ys);

			//print
			if(ans)
				System.out.println("OK");
			else
				System.out.println("NG");

		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}