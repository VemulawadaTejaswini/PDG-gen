import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			else calc(w,h);
		}
	}
	public void calc(int w, int h){
		int[][] map = new int[w][h];
		int[][] blacks = new int[w][h];
		int[][] whites = new int[w][h];
		ArrayList<int[]> wList = new ArrayList<int[]>();
		ArrayList<int[]> bList = new ArrayList<int[]>();
		for(int i = 0; i < h; i++){
			String next = sc.next();
			for(int j = 0; j < w; j++){
				char c = next.charAt(j);
				if(c == 'W'){
					map[j][i] = 1;
					blacks[j][i] = 1;
					wList.add(new int[]{j, i});
				}
				else if(c == 'B'){
					map[j][i] = -1;
					bList.add(new int[]{j, i});
					whites[j][i] = 1;
				}
			}
		}
		
		
		while(!wList.isEmpty()){
			int nowW = wList.get(0)[0];
			int nowH = wList.get(0)[1];
			wList.remove(0);
			
			if(nowW > 0 && map[nowW-1][nowH] == 0 &&  whites[nowW-1][nowH] == 0){
				whites[nowW-1][nowH] = 1;
				wList.add(new int[]{nowW-1, nowH});
			}
			if(nowW < w-1 && map[nowW+1][nowH] == 0 && whites[nowW+1][nowH] == 0){
				whites[nowW+1][nowH] = 1;
				wList.add(new int[]{nowW+1, nowH});
			}
			if(nowH > 0 && map[nowW][nowH-1] == 0 &&  whites[nowW][nowH-1] == 0){
				whites[nowW][nowH-1] = 1;
				wList.add(new int[]{nowW, nowH-1});
			}
			if(nowH < h-1 && map[nowW][nowH+1] == 0 && whites[nowW][nowH+1] == 0){
				whites[nowW][nowH+1] = 1;
				wList.add(new int[]{nowW, nowH+1});
			}
			
		}
		while(!bList.isEmpty()){
			int nowW = bList.get(0)[0];
			int nowH = bList.get(0)[1];
			bList.remove(0);
			
			if(nowW > 0 && map[nowW-1][nowH] == 0 &&  blacks[nowW-1][nowH] == 0){
				blacks[nowW-1][nowH] = 1;
				bList.add(new int[]{nowW-1, nowH});
			}
			if(nowW < w-1 && map[nowW+1][nowH] == 0 && blacks[nowW+1][nowH] == 0){
				blacks[nowW+1][nowH] = 1;
				bList.add(new int[]{nowW+1, nowH});
			}
			if(nowH > 0 && map[nowW][nowH-1] == 0 &&  blacks[nowW][nowH-1] == 0){
				blacks[nowW][nowH-1] = 1;
				bList.add(new int[]{nowW, nowH-1});
			}
			if(nowH < h-1 && map[nowW][nowH+1] == 0 && blacks[nowW][nowH+1] == 0){
				blacks[nowW][nowH+1] = 1;
				bList.add(new int[]{nowW, nowH+1});
			}
			
		}
		
		
		int black = 0;
		int white = 0;
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				if(map[i][j] == 0 && 
						((blacks[i][j] == 1 && whites[i][j] == 0) || (blacks[i][j] == 0 && whites[i][j] == 1)) ){
					if(blacks[i][j] == 1) black++;
					else white++;
				}
			}
		}
		System.out.println(black + " "+ white);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}