import java.util.Scanner;
public class Main {
	static final char APPLE_CHAR = '@';
	static final char KAKI_CHAR = '#';
	static final char ORANGE_CHAR = '*';
	static final char CHECKED = '0';
	char area[][];
	void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			int h = scan.nextInt();
			int w = scan.nextInt();
			if(h == 0 && w == 0)break;
			area = new char[h][w];
			for(int i = 0;i < h;i++){
				String col = scan.next();
				for(int j = 0;j < w;j++){
					area[i][j] = col.charAt(j);
				}
			}
			int groupCnt = 0;
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					if(Character.isDigit(area[i][j]))continue;
					groupCnt++;
					checkArea(i,j,area[i][j],groupCnt);
				}
			}
			System.out.println(groupCnt);
		}
	}

	void checkArea(int x,int y,char fruit,int group){
		if(x >= area.length)	return;
		if(x < 0)				return;
		if(y >= area[0].length)	return;
		if(y < 0)				return;
		if(area[x][y] == fruit){
			area[x][y] = CHECKED;
			checkArea(x + 1,y    ,fruit,group);
			checkArea(x - 1,y    ,fruit,group);
			checkArea(x    ,y + 1,fruit,group);
			checkArea(x    ,y - 1,fruit,group);
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}