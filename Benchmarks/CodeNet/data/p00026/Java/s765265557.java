import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int[][] map = new int[14][14];
		int[][][] ink = {
				{{0,0,0,0,0},{0,0,1,0,0},{0,1,1,1,0},{0,0,1,0,0},{0,0,0,0,0},},
				{{0,0,0,0,0},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{0,0,0,0,0},},
				{{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},},
		};
		for(;sc.hasNext();){
			String buf = sc.next().replace(',', ' ');
//			if(buf.equals("a")) break;
			Scanner sc2 = new Scanner(buf);
			
			int x = sc2.nextInt()+2;
			int y = sc2.nextInt()+2;
			int size = sc2.nextInt() -1;
			for(int i = 0;i<5;i++){
				for(int j=0;j < 5;j++){
					map[i+x-2][j+y-2] += ink[size][i][j]; 
				}
			}
		}
		int max = 0;
		int count = 0;
		for(int i=2;i<12;i++){
			for(int j=2;j<12;j++){
				if(map[i][j] == 0){
					count++;
				}
				if(max < map[i][j]){
					max = map[i][j];
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}