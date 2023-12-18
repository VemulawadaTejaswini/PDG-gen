import java.util.*;

public class Main {
	int n, h, w;
	boolean[][] map;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		map = new boolean[h+1][w+1];
		
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			drawMap(y, x, w);
		}
		if(checkMap()) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}
	
	void drawMap(int y, int x, int ww){
		for(int i=0;i<=h;i++){
			for(int j=x-ww;j<=x+ww;j++){
				if(j>=0 && j<=w){
					map[i][j] = true;
				}
			}
		}
		for(int i=y-ww;i<=y+ww;i++){
			if(i>=0 && i<=h){
				for(int j=0;j<=w;j++){
					map[i][j] = true;
				}
			}
		}	
	}
	
	boolean checkMap(){
		for(int i=0;i<=h;i++){
			for(int j=0;j<=w;j++){
				if(!map[i][j]) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}