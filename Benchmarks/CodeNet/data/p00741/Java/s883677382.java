import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	int w;
	int h;
	public void run(){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	w = scan.nextInt();
        	h = scan.nextInt();
        	if(w == 0 && h == 0){
        		break;
        	}
        	map = new char[h][w];
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w;j++){
        			map[i][j] = scan.next().charAt(0);
        		}
        	}
        	int count = 0;
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w;j++){
        			if(map[i][j] == '1'){
        				count++;
        				checkMap(i,j);
        			}
        		}
        	}
        	System.out.println(count);
        }
    }
	public void checkMap(int i,int j){
		if(map[i][j] == '0'){
			return;
		}
		map[i][j] = '0';
		for(int dx = -1;dx < 2;dx++){
			for(int dy = -1;dy < 2;dy++){
				if(i + dy >= 0 && i + dy < h &&j + dx >= 0 && j + dx < w && map[i + dy][j + dx] != '0'){
					checkMap(i + dy,j + dx);
				}
			}
		}
		return;
	}
}