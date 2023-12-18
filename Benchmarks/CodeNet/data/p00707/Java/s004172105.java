import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static int w;
	static int h;
	static String[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			w = stdIn.nextInt();
			h = stdIn.nextInt();
			if(w == 0 && h == 0) break;
			map = new String[h][w];
			for(int i = 0; i < h; i++) {
				String tmp = stdIn.next();
				for(int j = 0; j < w; j++) {
					map[i][j] = String.valueOf(tmp.charAt(j));
				}
			}
			
			String ans = dp();
			
			System.out.println(ans);
		}
	}
	public static String dp() {
		for(int i = h-1; i >= 0; i--) {
			for(int j = w-1; j >= 0; j--) {
				int cx1 = j;
				int cy1 = i+1;
				int cx2 = j+1;
				int cy2 = i;
				if(!fC(map[i][j])) continue;
				String a = map[i][j];
				String b = map[i][j];
				if(cx1 < w && cy1 < h &&fC(map[cy1][cx1])) {
					a = map[i][j] + map[cy1][cx1];
				}
				if(cx2 < w && cy2 < h && fC(map[cy2][cx2])) {
					b = map[i][j] + map[cy2][cx2];
				}
				if(StComp(a,b)) {
					map[i][j] = a;
				}
				else {
					map[i][j] = b;
				}
			}
		}
		String ret = "0";
		for(int i = 0; i < w; i++) {
			if(fC(map[0][i])  && StComp(LV(map[0][i]),ret)) {
				ret = LV(map[0][i]);
			}
		}
		return ret;
	}
	public static String LV(String a) {
		String cp = a;
		for(int i = 0; i < a.length(); i++) {
			if(cp.charAt(0) == '0') {
				cp = cp.substring(1, cp.length());
			}
		}
		return cp;
	}
	// 数字の文字列比較　aがbより大きいか等しい場合trueを返す
	public static boolean fC(String a) {
		if(a.length() >= 2) {
			return true;
		}
		for(int i = 0; i < 10; i++) {
			if(a.charAt(0) == String.valueOf(i).charAt(0)) {
				return true;
			}
		}
		return false;
	}
	public static boolean StComp(String a, String b) {

		if(a.length() > b.length()) return true;
		if(a.length() == b.length()) {
			if(a.compareTo(b) < 0) return false;
			else return true;
		}
		return false;
	}
}
	