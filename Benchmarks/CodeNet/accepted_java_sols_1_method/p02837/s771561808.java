import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] g = new int[n][][];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            g[i] = new int[a][2];
            for (int j = 0; j < a; j++) {
                g[i][j][0] = sc.nextInt() -1;
                g[i][j][1] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < 1<<n; i++) {
            int[] a = new int[n];
            boolean able = true;
            for (int j = 0; j < n; j++) {
                if((i >> j & 1) == 1){
                    a[j] = 1;
                }
            }
            for (int j = 0; j < n; j++) {
                if(a[j]==0)continue;
                for(int[] b : g[j]){
                    if(a[b[0]] != b[1]){
                        able = false;
                        break;
                    }
                }
                if(!able) break;
            }
            if(able){
                int tmp = 0;
                for (int j = 0; j < n; j++) {
                    if(a[j] == 1) tmp++;
                }
                if(ans < tmp) ans = tmp;
            }
        }

        System.out.println(ans);
        sc.close();

    }

}
