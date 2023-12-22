import java.util.*;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ls = new int[m];
        int[] rs = new int[m];
        for(int tmp = 0; tmp<m; tmp++){
            ls[tmp] = sc.nextInt();
            rs[tmp] = sc.nextInt();
        }
        int l = 0;
        int r = INF;
        for(int tmp = 0; tmp< m; tmp++){
            int x = ls[tmp];
            l = Math.max(x,l);
            int y = rs[tmp];
            r = Math.min(y,r);
        }

        System.out.println(l <= r ? r - l + 1 : 0);
    }
}
