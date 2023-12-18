import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		String[] s = new String[h];
		for(i = 0; i <h; i++) {
			s[i] = sc.next();
		}
		sc.close();
		int[][] hc = new int[h][w];
		int[][] wc = new int[h][w];
		for(i = 0; i < h; i++) {
			int ws = 0;
			while(ws<w) {
				int wp = s[i].indexOf("#", ws);
				if(wp == -1) wp = w;
				for(j = ws; j < wp; j++) {
					wc[i][j] = wp - ws;
				}
				if(wp>=w)break;
				wc[i][wp] = 0;
				ws = wp+1;
			}
//			System.out.println(Arrays.toString(wc[i]));
		}
		for(i = 0; i < w; i++) {
			int hs = 0;
			while(hs<h) {
				int hp = h;
				for(j = hs; j < h; j++) {
					if(s[j].charAt(i) == '#') {
						hp = j;
						break;
					}
				}
				for(j = hs; j < hp; j++) {
					hc[j][i] = hp - hs;
				}
				if(hp>=h)break;
				wc[hp][i] = 0;
				hs = hp+1;
			}
//			System.out.println(Arrays.toString(hc[i]));
		}
		int max = 0;
		for(i = 0; i < h; i++) {
			for(j = 0; j < w; j++) {
				int nn = wc[i][j] + hc[i][j] -1;
				if(nn > max)max = nn;
			}
		}
		System.out.println(max);
	}
}
