

import java.util.Scanner;

/**
 * AOJ id=0118
 * PropertyDistribution
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}
	
	char[][] field;
	public Main(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0)
				break;
			
			field = new char[h+2][w+2];
			for(int i=1;i<=h;i++){
				String line = sc.next();
				for(int j=1;j<=w;j++){
					field[i][j] = line.charAt(j-1);
				}
			}
			for(int i=0;i<h+2;i++){
				field[0][i]=' ';
				field[h+1][i] = ' ';
				field[i][0] = ' ';
				field[i][w+1] = ' ';
			}
			
			solve(h, w);
		}
	}
		
	private void solve(int h, int w){
		int res = 0;
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				if(field[i][j]!=' '){
					res++;
					rec(j, i);
				}
			}
		}
		
		System.out.println(res);
	}
	
	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, -1, 0, 1};
	private void rec(int x, int y){
		char cur = field[y][x];
		field[y][x]=' ';

		for(int i=0;i<4;i++){
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(field[ny][nx]==cur){
				rec(nx, ny);
			}
		}
	}
}