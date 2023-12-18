import java.util.*;

public class Main {

	void run() {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int[][] MAP = new int[5][5];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					MAP[i][j] = cin.nextInt();
				}
			}
			int ans = 0;
			for (int x1 = 0; x1 < 5; x1++) {
				for (int x2 = x1 + 1; x2 <= 5; x2++) {
					for (int y1 = 0; y1 < 5; y1++) {
						for (int y2 = y1 + 1; y2 <= 5; y2++) {
							Boolean check = true;
							for(int x=x1;x<x2;x++){
								for(int y=y1;y<y2;y++){
									if(MAP[x][y]==0)check=false;
								}
							}
							if(check){
								ans=Math.max(ans, (x2-x1)*(y2-y1));
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδ?ソツッツドツ・ツスツタツブ
		new Main().run();
	}

}