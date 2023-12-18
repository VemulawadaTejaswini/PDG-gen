import java.util.*;

public class Main {
    private static final String lin = "####################";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][][] tbl = new int[4][3][10];
        for(int i = 0, n = scn.nextInt(); i < n; i++) {
            int b = scn.nextInt(), f = scn.nextInt();
            int r = scn.nextInt(), v = scn.nextInt();
            tbl[~-b][~-f][~-r] += v;
        }
        for(int b = 0; b < 4; b++) {
            for(int f = 0; f < 3; f++) {
                for(int r = 0; r < 10; r++) {
                    System.out.print(" " + tbl[b][f][r]);
                }
                System.out.println();
            }
            if(b < 3) {
                System.out.println(lin);
            }
        }
    }
}