import java.util.Scanner;

public class Main {
	static final char CHECKED = 'C';
	static final char BLACK = '.';
	static final char START = '@';
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int w = s.nextInt();
			int h = s.nextInt();
			if(w == 0 && h == w)break;
			int x = 0;
			int y = 0;
			char tile[][] = new char[h][w];
			for(int i = 0;i < h;i++){
				String row = s.next();
				for(int j = 0;j < w;j++){
					tile[i][j] = row.charAt(j);
					if(tile[i][j] == START){
						x = i;
						y = j;
					}
				}
			}
			System.out.println(cntTile(tile,x,y));
		}
	}

	int cntTile(char[][] panel,int x,int y){
		//??????????????´??????????????\????????¢?´¢???????????????0????????´?????????
		if(x > panel.length - 1)return 0;
		if(x < 0)return 0;
		if(y > panel.length - 1)return 0;
		if(y < 0)return 0;
		panel[x][y] = CHECKED;
		int cnt = 0;
		//??±???????????¢?´¢????????????????????¢?´¢??????????????°?????????
		if(panel[x + 1][y] == BLACK)
				cnt += cntTile(panel,x + 1,y);
		if(panel[x - 1][y] == BLACK)
				cnt += cntTile(panel,x - 1,y);
		if(panel[x][y + 1] == BLACK)
				cnt += cntTile(panel,x,y + 1);
		if(panel[x][y - 1] == BLACK)
				cnt += cntTile(panel,x,y - 1);
		cnt++;
		return cnt;
	}

/*
 * Original Code
	int cntTile(String[][] panel,int[][] chkP,char tile,int x,int y){
		chkP[x][y] = -1;
		int cnt = 0;
		if(x + 1 < panel.length ){
			if(chkP[x + 1][y] != -1 && panel[x + 1][y].charAt(0) == tile)
				cnt += cntTile(panel,chkP,tile,x + 1,y);
		}
		if(x > 0 ){
			if(chkP[x - 1][y] != -1 && panel[x - 1][y].charAt(0) == tile)
				cnt += cntTile(panel,chkP,tile,x - 1,y);
		}
		if(y + 1 < panel[x].length ){
			if(chkP[x][y + 1] != -1 && panel[x][y + 1].charAt(0) == tile)
				cnt += cntTile(panel,chkP,tile,x,y + 1);
		}
		if(y > 0 ){
			if(chkP[x][y - 1] != -1 && panel[x][y - 1].charAt(0) == tile)
				cnt += cntTile(panel,chkP,tile,x,y - 1);
		}
		cnt++;
		return cnt;
	}

*/
public static void main(String args[]){
		new Main().run();
	}
}