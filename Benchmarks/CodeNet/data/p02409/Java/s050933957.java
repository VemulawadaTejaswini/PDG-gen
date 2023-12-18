import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final String WALL = "####################";
    
    public static void main(String[] args) {
        int[][][] tbl = new int[4][3][10];
        for(int n = scn.nextInt(); n > 0; n--) {
            int b = load(), f = load(), r = load();
            tbl[b][f][r] += scn.nextInt();
        }
        for(int i = 0; i < 4; i++) {
            if(i > 0) {
                System.out.println(WALL);
            }
            print(tbl[i]);
        }
    }
    
    private static int load() {
        return scn.nextInt() - 1;
    }
    
    private static void print(int[][] tbl) {
        for(int[] ary : tbl) {
            for(int elm : ary) {
                System.out.format("%2d", elm);
            }
            System.out.println();
        }
    }
}