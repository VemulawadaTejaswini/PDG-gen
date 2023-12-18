import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int t, h, w;
	static char[][] field;
	static String order;
	static int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		t = sc.nextInt();
		for(int i = 0; i < t; i++){
			h = sc.nextInt();
			w = sc.nextInt();
			field = new char[h][w];
			for(int j = 0; j < field.length; j++){
				field[j] = sc.next().toCharArray();
			}
			int no_use = sc.nextInt();
			order = sc.next();
			solve();
			if(i != t-1){
				printField();
			}else{
				for(int k = 0; k < field.length; k++){
					for(int j = 0; j < field[0].length; j++){
						System.out.print(field[k][j]);
					}
					System.out.println();
				}
			}
		}
		return true;
	}
	
	static void solve(){
		int sx = 0, sy = 0;
		char tank = '-';
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == '^'){
					sx = j; sy = i; tank = field[i][j];
				}else if(field[i][j] == '>'){
					sx = j; sy = i; tank = field[i][j];
				}else if(field[i][j] == '<'){
					sx = j; sy = i; tank = field[i][j];
				}else if(field[i][j] == 'v'){
					sx = j; sy = i; tank = field[i][j];
				}
			}
		}
		int nx = sx, ny = sy;
		for(int i = 0; i < order.length(); i++){
			char c = order.charAt(i);
			switch(c){
			case 'U':
				tank = '^';
				nx += dx[0]; ny += dy[0];
				if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] == '.'){
					field[ny][nx] = '^';
					field[ny-dy[0]][nx-dx[0]] = '.';
				}else{
					nx -= dx[0]; ny -= dy[0];
				}
				break;
			case 'D':
				tank = 'v';
				nx += dx[2]; ny += dy[2];
				if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] == '.'){
					field[ny][nx] = 'v';
					field[ny-dy[2]][nx-dx[2]] = '.';
				}else{
					nx -= dx[2]; ny -= dy[2];
				}
				break;
			case 'L':
				tank = '<';
				nx += dx[3]; ny += dy[3];
				if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] == '.'){
					field[ny][nx] = '<';
					field[ny-dy[3]][nx-dx[3]] = '.';
				}else{
					nx -= dx[3]; ny -= dy[3];
				}
				break;
			case 'R':
				tank = '>';
				nx += dx[1]; ny += dy[1];
				if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] == '.'){
					field[ny][nx] = '>';
					field[ny-dy[1]][nx-dx[1]] = '.';
				}else{
					nx -= dx[1]; ny -= dy[1];
				}
				break;
			case 'S':
				shot(nx, ny, tank);
				break;
			default:
				break;
			}
		}
	}
	
	static void printField(){
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void shot(int x, int y, char t){
		int vector = 0;
		switch(t){
		case '^':
			vector = 0; break;
		case '>':
			vector = 1; break;
		case 'v':
			vector = 2; break;
		case '<':
			vector = 3; break;
		default:
			break;
		}
		int nx = x + dx[vector], ny = y + dy[vector];
		while(true){
			if(nx < 0 || nx >= field[0].length || ny < 0 || ny >= field.length)break;
			if(field[ny][nx] == '#')break;
			if(field[ny][nx] == '*'){field[ny][nx] = '.'; break;}
			nx += dx[vector]; ny += dy[vector];
		}
	}

}