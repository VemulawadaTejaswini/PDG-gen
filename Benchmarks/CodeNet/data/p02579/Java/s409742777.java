import java.util.*;

public class Main {
    
    static String[] map;
    static final int[] walkW = {0,1,0,-1,0};
    static final int[] walkH = {1,0,-1,0,0};
    
    static final int[] wpW = {1,2,
            1,2,
            1,2,
            1,2,
            1,2,
            -1,-2,
            -1,-2,
            -1,-2,
            -1,-2,
            -1,-2,
            0,0,0,0};
    static final int[] wpH = {0,0,
            -1,-1,
            -2,-2,
            1,1,
            2,2,
            0,0,
            -1,-1,
            -2,-2,
            1,1,
            2,2,
            1,2,-1,-2};
    
    static int H;
    static int W;
    
    static int WH;
    static int WW;
    static int GH;
    static int GW;
    
    static boolean goal = false;
    
    static int max = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        WH = sc.nextInt()-1;
        WW = sc.nextInt()-1;
        GH = sc.nextInt()-1;
        GW = sc.nextInt()-1;
        map = new String[H];
        for (int i = 0; i < H; i++) {
            map[i] = sc.next();
        }
        if (WH == GH && WW == GW) {
            System.out.println(0);
            return;
        }
        boolean[][] al = new boolean[H][W];
        int count = 0;
        while (true) {
            walk(WH, WW, al, count);
            if (goal) {
                System.out.println(max);
                return;
            } else {
                System.out.println(-1);
            }
        }
    }
    
    private static boolean canWalk(int wh, int ww, int i) {
        int goH = walkH[i] + wh;
        int goW = walkW[i] + ww;
        if (goH < 0 || H <= goH || goW < 0 || W <= goW) {
            return false;
        } else {
            if (map[goH].charAt(goW) == '#') {
                return false;
            } else {
                return true;
            }
        }  
    }
    
    private static void walk(int wh, int ww, boolean[][] al, int count) {
        boolean[][] clone = al.clone();
        int countC = count;
        clone[wh][ww] = true;
        if (wh == GH && ww == GW) {
            max = Math.min(countC, max);
            goal = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (canWalk(wh,ww,i)) {
                int goH = wh + walkH[i];
                int goW = ww + walkW[i];
                if (!clone[goH][goW]) {
                    walk(goH, goW, clone, countC);
                }
            } else {
                int goH = wh + walkH[i];
                int goW = ww + walkW[i];
                if (goH < 0 || H <= goH || goW < 0 || W <= goW) {
                    continue;
                } else {
                    for (int w = 0; w < wpH.length; w++) {
                        int goh = wh + wpH[w];
                        int gow = ww + wpW[w];
                        if (canWalk(goh,gow,4) && !clone[goh][gow]) {
                            walk(goh, gow, clone, ++countC);
                        }
                    }
                }
            }
        }
    }
}