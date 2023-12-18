
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int[][] map;
	
	int[] dx = {-1,0,1,1,1,0,-1,-1};
	int[] dy = {-1,-1,-1,0,1,1,1,0};
	void rec(int i, int j , int l){
		for(int z = 0; z < 8 ; z++){
			if(map[i+dx[z]][j+dy[z]] == -1){
				map[i+dx[z]][j+dy[z]] = l;
				rec(i+dx[z],j+dy[z],map[i][j]);
			}
		}
	}
	
	void run(){
		for(;;){
			int w = sc.nextInt();
			int h = sc.nextInt();
			map = new int[h+2][w+2];
			if((w|h) == 0){
				break;
			}
		
			for(int i = 1; i < h +1 ;i++){
				for(int j = 1; j < w + 1; j++){
					map[i][j] = - sc.nextInt();
				}
			}
			
			int l = 1;
			for(int i = 1 ; i <h+1 ; i++){
				for(int j = 1 ; j < w +1; j++){
					if(map[i][j] == -1){
						map[i][j] = l++;
						rec(i,j,map[i][j]);
					}
				}
			}
			System.out.println(l-1);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}