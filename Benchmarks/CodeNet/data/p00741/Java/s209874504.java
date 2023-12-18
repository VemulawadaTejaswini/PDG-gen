
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for(;;){
			
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int map[][] = new int[h+2][w+2];
			
			
			for(int i =0 ; i < h ;i++){
				for(int j= 0; j< w;j++){
					map[i+1][j+1] = sc.nextInt();
				}
			}
			
			int count = 0;
			
			for(int i = 1;i < h+1; i++){
				for(int j = 1 ;j  < w+1; j++){
					if(map[i][j] == 1){
						count++;
						label(map,i,j,count);
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
	
	int dx[] = {1,-1,0,0};
	int dy[] = {0,0,1,-1};
	void label(int[][] map,int i,int j,int count){
//		System.out.println(i+" "+j);
		if(map[i][j] <= 0){
			return;
		}
		
		map[i][j] = -count;
		for(int k =0;k < 4; k++){
			label(map,i+dx[k],j+dy[k],count);
		}
		
	}
}

