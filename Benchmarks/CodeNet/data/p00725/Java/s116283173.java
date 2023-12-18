import java.util.Scanner;

public class Main {

	static int w, h, count=100;
	static int[] v1 = {1, 0, -1, 0};
	static int[] v2 = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			count=100;
			w = cin.nextInt();
			h = cin.nextInt();
			if(w+h==0){
				break;
			}
			Field f = new Field();
			f.field = new int[h+2][w+2];
			f.flr = 1;
			for(int i = 0; i<= h+1; i++){
				f.field[i][0] = -1;
				f.field[i][w+1] = -1;
			}
			for(int i = 0; i<= w+1; i++){
				f.field[0][i] = -1;
				f.field[h+1][i] = -1;
			}
			for(int i = 1; i<= h; i++){
				for(int j = 1; j <= w; j++){
					String str = cin.next();
					f.field[i][j] = Integer.parseInt(str);
					if(f.field[i][j] == 2){
						f.x = i;
						f.y = j;
					}
				}
			}
			recursive(f);
			if(count==100){
				System.out.println(-1);
			}
			else{
				System.out.println(count);
			}
		}
	}
	static void recursive(Field f){
		if(f.flr > 10 || f.flr >= count)
			return;
		for(int i = 0; i < 4; i++){
			int nowX = f.x;
			int nowY = f.y;
			boolean first = true;	
			while(true){
				nowX += v1[i];
				nowY += v2[i];
				if(f.field[nowX][nowY] == -1){
					break;
				}
				if(f.field[nowX][nowY] == 3){
					count = Math.min(count, f.flr);
					break;
				}
				if(first){
					if(f.field[nowX][nowY] == 1){
						break;
					}
					first = false;
				}
				else{
					if(f.field[nowX][nowY] == 1){
						Field a = new Field();
						//a.field = f.field.clone();
						/*
						a.field = new int[h+2][w+2];
						for(int k = 0; k < h+2; k++){
							for(int j = 0; j < w+2; j++){
								a.field[k][j] = f.field[k][j];
							}
						}
						*/
						a.field = new int[h+2][];
						
						for(int j = 0; j < h+2; j++){
							a.field[j] = f.field[j].clone();
						}
						//output(a);
						a.field[f.x][f.y] = 0;
						a.field[nowX][nowY] = 0;
						a.field[nowX-v1[i]][nowY-v2[i]] = 2;
						a.x = nowX-v1[i];
						a.y = nowY-v2[i];
						a.flr = f.flr+1;
						//output(f);
						recursive(a);
						break;
					}
				}
			}
		}
	}
	static void output(Field f){
		for(int i = 0; i<= h+1; i++){
			for(int j = 0; j <= w+1; j++){
				System.out.print(f.field[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class Field{
	int[][] field;
	int x, y;
	int flr;
}