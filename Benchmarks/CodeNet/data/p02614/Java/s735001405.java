import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] c = new int[h][w];
        for (int i = 0; i < h; i++) {
            char[] x = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(x[j] == '#'){
                    c[i][j]++;
                }
            }
        }
        long ans = 0L;
        for (int i = 0; i < 1<<h; i++) {
            for (int j = 0; j < 1<<w; j++) {
                int tmp = 0;
                for (int a = 0; a < h; a++) {
                    if((i >> a & 1) == 1) continue;
                    for (int l = 0; l < w; l++) {
                        if((j >> l & 1) == 1)continue;
                        tmp += c[a][l];
                    }
                }
                if(tmp == k)ans++;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
