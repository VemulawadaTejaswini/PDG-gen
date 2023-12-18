import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		for(;;){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			int[][] map = new int[400][400];
			for(int i=0;i<400;i++){
				Arrays.fill(map[i], -1);
			}
			map[200][200] = 0;
			
			
			for(int i = 1;i < n;i++){
				int o = sc.nextInt();
				int d = sc.nextInt();
			
				int x = 0;
				int y = 0;
				for(int k = 0; k < 400; k++){
					for(int z = 0;z <400;z++){
						if(map[k][z] == o){
							x = k;
							y = z;
						}
					}
				}
				if(d == 0){
					map[x][y-1] = i;
				}
				if(d == 1){
					map[x+1][y] = i;
				}
				if(d == 2){
					map[x][y+1] = i;
				}
				if(d == 3){
					map[x-1][y] = i;
				}
			}
			
			int minx = 400;
			int miny = 400;
			int maxx = 0;
			int maxy = 0;
			
			for(int i = 0; i < 400;i++){
				for(int j = 0; j < 400; j++){
					if(map[i][j] != -1){
						minx = Math.min(minx,i);
						miny = Math.min(miny,j);
						maxx = Math.max(maxx,i);
						maxy = Math.max(maxy,j);
					}
				}
			}
			System.out.println((maxy-miny + 1) +" " + (maxx -minx+1));
		}
		
	}
	
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}