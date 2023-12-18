import java.awt.Rectangle;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static Rectangle[] rec = new Rectangle[26];
	static boolean[] check = new boolean[26];
	
	public static void main(String[] args) {
		int n;
		n = sc.nextInt();	// input
		while(n-- > 0) {
			for(int i=0; i < 26; i++) {	// initialize
				rec[i] = new Rectangle();
				rec[i].x = rec[i].y = 50;
				rec[i].width = rec[i].height = 0;
				check[i] = false;
			}
			HashSet<Integer> count = new HashSet<Integer>();
			int h, w;
			h = sc.nextInt();	// input
			w = sc.nextInt();	// input
			int map[][] = new int[h][w];
			for(int y=0; y < h; y++) {
				String str = sc.next();
				for(int x=0; x < w; x++) {
					map[y][x] = (int)str.charAt(x); // input
					if(map[y][x] == '.') continue;
					int idx = map[y][x] - 'A';
					if(rec[idx].x > x) rec[idx].x = x;				// start
					if(rec[idx].y > y) rec[idx].y = y;				// start
					if(rec[idx].width < x) rec[idx].width = x;		// end
					if(rec[idx].height < h) rec[idx].height = y;	// end
					check[idx] = true; count.add(idx);
				}
			}
			int cnt = 0;
			boolean flg = true;
			while(flg) {
				flg = false;
				for(int i=0; i < 26; i++) {
					if(check[i]){
						int mozi = 'A' + i;
						boolean success = true;
						for(int y=rec[i].y; y <= rec[i].height; y++)
							for(int x=rec[i].x; x <= rec[i].width; x++){
								if(map[y][x] != mozi && map[y][x] != -1) {
									success = false;
									break;
								}
							}
						if(success){
							for(int y=rec[i].y; y <= rec[i].height; y++)
								for(int x=rec[i].x; x <= rec[i].width; x++){
									map[y][x] = -1;
								}
							flg = true;
							check[i] = false;
							cnt++;
						}
					}
				}
			}
			if(cnt == count.size())
				System.out.println("SAFE");
			else
				System.out.println("SUSPICIOUS");
		}
	}
}