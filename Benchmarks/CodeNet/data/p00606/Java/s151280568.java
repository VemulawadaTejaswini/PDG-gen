import java.util.Scanner;

/**
 * Cleaning Robot
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1020&lang=jp
 *
 * @author Igari Kazuya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();

			if(n == 0){
				break;
			}

			String s,t,b;
			s = sc.next();
			t = sc.next();
			b = sc.next();

			int[][] map = new int[5][5];
			int[][] scoremap = new int[3][3];
			int[][] bufmap = new int[3][3];
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					scoremap[i][j] = 0;
					bufmap[i][j] = 0;
					map[i+1][j+1] = 0;
				}
			}

			for(int i=0;i<5;i++){
				map[i][0] = 1;
				map[0][i] = 1;
				map[i][4] = 1;
				map[4][i] = 1;
			}

			int ss = s.charAt(0) - 'A';
			int tt = t.charAt(0) - 'A';
			int bb = b.charAt(0) - 'A';

			map[bb/3+1][bb%3+1] = 1;
			scoremap[ss/3][ss%3] = 1;//ツ機ツ械ツつソツづ。ツづア

			for(int i=0;i<n;i++){
				for(int y=0;y<3;y++){
					for(int x=0;x<3;x++){
						if(map[y+1][x] == 0){
							bufmap[y][x-1] += scoremap[y][x];
						}else{
							bufmap[y][x] += scoremap[y][x];
						}

						if(map[y+1][x+2] == 0){
							bufmap[y][x+1] += scoremap[y][x];
						}else{
							bufmap[y][x] += scoremap[y][x];
						}

						if(map[y][x+1] == 0){
							bufmap[y-1][x] += scoremap[y][x];
						}else{
							bufmap[y][x] += scoremap[y][x];
						}

						if(map[y+2][x+1] == 0){
							bufmap[y+1][x] += scoremap[y][x];
						}else{
							bufmap[y][x] += scoremap[y][x];
						}
					}
				}
				for(int x=0;x<3;x++){
					for(int y=0;y<3;y++){
						scoremap[y][x] = bufmap[y][x];
						bufmap[y][x] = 0;
					}
				}
			}

			int count=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					count += scoremap[i][j];
				}
			}
			System.out.printf("%.8f\n",(double)scoremap[tt/3][tt%3]/(double)count);
		}
	}
}