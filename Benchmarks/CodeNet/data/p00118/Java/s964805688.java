import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	int h;
	int w;
	char[][] map;
	int[] dx = {-1,1,0,0};
	int[] dy = {0,0,-1,1};
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			h = scan.nextInt();
			w = scan.nextInt();
			if(h == 0 && w == 0){
				break;
			}
			map = new char[h][w];
			for(int i = 0;i < h;i++){
				map[i] = scan.next().toCharArray();
			}
			int count = 0;
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					if(map[i][j] != '-'){
						count++;
						checkMap(i,j,map[i][j]);
					}
				}
			}
			System.out.println(count);
		}
	}
	public void checkMap(int y,int x,char a){
		if(map[y][x] == '-'){
			return;
		}
		map[y][x] = '-';
		for(int i = 0;i < 4;i++){
			if(x+dx[i] >= 0 && x+dx[i] < w && y+dy[i] >= 0 && y+dy[i] < h && map[y+dy[i]][x+dx[i]] == a){
				checkMap(y+dy[i],x+dx[i],a);
			}
		}
	}
}