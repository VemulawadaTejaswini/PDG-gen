import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] a = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(s[j] == '#') a[i][j] = true;
            }
        }
        int idx = 0;
        int[][] ans = new int[h][w];
        int l = 0;
        for (int r = 0; r < w; r++) {
            boolean start = false;
            int t = 0;
            for (int b = 0; b < h; b++) {
                if(a[b][r]){
                    if(start){
                        for (int i = t; i < b; i++) {
                            for (int j = l; j <= r; j++) {
                                ans[i][j] = idx;
                            }
                        }
                        t = b;
                    }else{
                        start = true;
                    }
                    idx++;
                }
            }
            if(start){
                for (int i = t; i < h; i++) {
                    for (int j = l; j <= r; j++) {
                        ans[i][j] = idx;
                    }
                }
                l = r+1;
            }else if(0 < l){
                for (int i = 0; i < h; i++) {
                    ans[i][l] = ans[i][l-1];
                }
                l = r+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(ans[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
