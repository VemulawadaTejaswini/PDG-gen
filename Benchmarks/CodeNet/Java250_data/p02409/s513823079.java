import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[][][] ary;
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        ary = new int[4][3][10];
        for (int i = 0;i < n;i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            calc(b, f, r, v);
        }
        disp();
    }
    
    private static void calc(int b, int f, int r, int v) {
        ary[b-1][f-1][r-1] += v;
    }
    
    private static void disp() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < 4;i++) {
            for (int j = 0;j < 3;j++) {
                for (int k = 0;k < 10;k++) {
                    sb.append(" ").append(ary[i][j][k]);
                }
                System.out.println(sb.toString());
                sb = new StringBuilder();
            }
            if (i == 3) break;
            System.out.println("####################");
        }
    }
}