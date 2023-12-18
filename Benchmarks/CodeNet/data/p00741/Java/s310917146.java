import java.awt.geom.*;
import java.util.*;

public class Main {
	int [][] data;
	private void dfs(int x, int y ){
		data[y][x] = 0;
		for(int ydis = -1; ydis <= 1; ydis++){
			for(int xdis = -1; xdis <= 1; xdis++){
				//System.out.println((x + xdis) + " " + (y + ydis));
				if(data[y + ydis][x + xdis] == 1)
					dfs(x + xdis, y + ydis);
			}
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w ==0 && h == 0) break;
			data = new int[h+2][w+2];
			for(int i =1; i <= h; i++){
				for(int j = 1; j <= w;j++){
					data[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			for(int i =1; i <= h; i++){
				for(int j = 1; j <= w;j++){
					if(data[i][j] == 1){
						dfs(j,i);
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}