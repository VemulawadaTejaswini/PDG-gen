package NumberOfIsland;

import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * NumberOfIsland
 *
 * ??¶?????°???????????????
 * </pre>
 *
 * @author ?????????????????§???
 *
 */
public class NumberofIsland {

    static boolean[][] map;
    static boolean[][] check;
    static int island ;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
	            map = new boolean[12][12];
	            check = new boolean[12][12];
	            island = 0;
	            for(int cnt = 0; cnt < map.length; cnt++) {
	                int trans = 0;
	                for( String s : sc.next().split("",0)) {
	                    if(s.equals("1")) {
	                        map[cnt][trans] = true;
	                    }
	                    else {
	                        map[cnt][trans] = false;
	                    }
	                    trans++;
	                }
	            }
	            for(int mh = 0; mh < map.length ; mh++) {
	                for(int mw = 0; mw < map.length; mw++) {
	                    if(map[mh][mw] && !check[mh][mw]) {
	                        fun(mh,mw);
	                    }
	                }
	            }
	            System.out.println(island);
		} // ?????????????????????
	}// ?????????????????????????????????

	static void fun(int mh, int mw) {
        flag(mh,mw);
        island++;
    }

    static void flag(int mh, int mw) {
        check[mh][mw] = true;

        if(mw + 1 < 12 && map[mh][mw+1] && !check[mh][mw+1]) {
            flag(mh,mw+1);
        }
        if(mh + 1 < 12 && map[mh+1][mw] && !check[mh+1][mw]) {
            flag(mh+1,mw);
        }
        if(mw - 1 > -1 && map[mh][mw-1] && !check[mh][mw-1]) {
            flag(mh,mw-1);
        }
        if(mh - 1 > -1 && map[mh-1][mw] && !check[mh-1][mw]) {
            flag(mh-1,mw);
        }
    }
}// ??????????????????????????????