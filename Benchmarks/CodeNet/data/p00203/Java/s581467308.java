import java.util.*;

public class Main {
	Scanner sc;
	int w,h;
	int[][] map;
	int[][] route;
	
	void printMap(){
		for(int i=0;i<h+2;i++) {
			for(int j =0;j<w+2;j++) {
				System.out.print(route[i][j] + " ");
			}
			System.out.print(" ");
			for(int j =0;j<w+2;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) break;
			map = new int[h+2][w+2];
			route = new int[h+2][w+2];
			for(int i=0;i<h;i++) for(int j=0;j<w+2;j++) { map[i][j] = 1; route[i][j] = 0; }
			for(int i=h;i<h+2;i++)for(int j=0;j<w+2;j++) { map[i][j] = 0; route[i][j] = 0; }
			for(int i=0;i<h;i++) for(int j=1;j<w+1;j++) map[i][j] = sc.nextInt();
			for(int j=1;j<w+1;j++) if(map[0][j] != 1) route[0][j] = 1;
			for(int i=0;i<h-1;i++) for(int j=1;j<w+1;j++){
//				if(j==1)printMap();
				if(map[i][j] == 0){
					if(map[i+1][j-1] == 0) route[i+1][j-1] += route[i][j];
					if(map[i+1][j] != 1) route[i+1][ j ] += route[i][j];
					if(map[i+1][j+1] == 0) route[i+1][j+1] += route[i][j];
				}
				else if(map[i][j] == 2) {
					if(map[i+2][j] != 1) route[i+2][ j ] += route[i][j];
				}
			}
			int ans = 0;
			for(int i=h-1;i<h+1;i++) for(int j=1;j<w+1;j++) {
				ans += route[i][j];
			}
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		new Main.run();
	}
}