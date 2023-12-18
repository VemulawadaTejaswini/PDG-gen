import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	int w;
	int h;
	int count;
	short[][] map;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			w = scan.nextInt();
			h = scan.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			map = new short[h][w];
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					map[i][j] = scan.nextShort();
				}
			}
			count = 0;
			for(int i = 0;i < w;i++){
				if(map[0][i] != 1){
					count += ski(0,i);
				}
			}
			System.out.println(count);
		}
	}
	public int ski(int y,int x){
		if(y == h-1 && x >= 0 && x < w){
			return 1;
		}
		int res = 0;
		if(map[y][x] == 2){
			if(y == h-2){
				return 1;
			}else if(map[y+2][x] == 1){
				return 0;
			}else{
				res += ski(y+2,x);
			}
		}else{
			if(x-1 >= 0 && map[y+1][x-1] == 0){
				res += ski(y+1,x-1);
			}
			if(map[y+1][x] != 1){
				res += ski(y+1,x);
			}
			if(x+1 < w && map[y+1][x+1] == 0){
				res += ski(y+1,x+1);
			}
		}
		return res;
	}
}