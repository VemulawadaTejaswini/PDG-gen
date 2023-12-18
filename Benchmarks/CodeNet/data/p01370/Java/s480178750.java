import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int t = sc.nextInt();
			int n = sc.nextInt();
			if(t == 0 && n == 0)break;
			else calc(t, n);
			
		}
	}
	public void calc(int t, int n){
		int[][] map = new int[61][61];
		for(int i = 0; i < n; i ++){
			int x = sc.nextInt() + 30;
			int y = sc.nextInt() + 30;
			map[x][y] = -1;
		}
		int x = sc.nextInt() + 30;
		int y = sc.nextInt() + 30;
		
		map[x][y] = 1;
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{x, y});
		
		while(!list.isEmpty()){
			x = list.get(0)[0];
			y = list.get(0)[1];
			list.remove(0);
			if(map[x][y] < t + 1){
				if(x > 0 && map[x-1][y] == 0){
					map[x-1][y] = map[x][y] + 1;
					list.add(new int[]{x-1, y});
				}
				if(x < 60 && map[x+1][y] == 0){
					map[x+1][y] = map[x][y] + 1;
					list.add(new int[]{x+1, y});
				}
				if(y > 0 && map[x][y-1] == 0){
					map[x][y-1] = map[x][y] + 1;
					list.add(new int[]{x, y-1});
				}
				if(y < 60 && map[x][y+1] == 0){
					map[x][y+1] = map[x][y] + 1;
					list.add(new int[]{x, y+1});
				}
				if(x > 0 && y > 0 && map[x-1][y-1] == 0){
					map[x-1][y-1] = map[x][y] + 1;
					list.add(new int[]{x-1, y-1});
				}
				if(x < 60 && y < 60 && map[x+1][y+1] == 0){
					map[x+1][y+1] = map[x][y] + 1;
					list.add(new int[]{x+1, y+1});
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < 61; i++){
			for(int j = 0; j < 61; j++){
				if(map[i][j] <= t+1 && map[i][j] > 0) sum++;
			}
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}