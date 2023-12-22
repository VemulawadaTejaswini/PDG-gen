import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next(), t = sc.next();
        char[] s1 = s.toCharArray(), t1 = t.toCharArray();
        int[][] f = new int[s1.length + 1][t1.length + 1],last = new int[s1.length + 1][t1.length + 1];
        StringBuilder sb = new StringBuilder();
        // 第二种 回溯，可以借助一个数组，标记 dp的方向；
        for(int i = 1; i <= s1.length; i ++) {
            for (int j = 1; j <= t1.length; j++) {
                if (s1[i - 1] == t1[j - 1]) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                    last[i][j] = 3; // 记录方向 左上角
                } else {
                    if (f[i][j - 1] > f[i - 1][j]) {
                        f[i][j] = f[i][j - 1];
                        last[i][j] = 1; // 记录方向 左
                    } else {
                        f[i][j] = f[i - 1][j];
                        last[i][j] = 2;// 记录方向 上
                    }
                }
            }
        }
        int x = s1.length - 1, y = t1.length - 1;
        while(f[x + 1][y + 1] > 0){
            if(last[x + 1][y + 1] == 3){
                sb.append(s1[x]);
                x--;
                y--;
            }else if(last[x + 1][y + 1] == 2)x--;
            else y--;
        }

        /*  第一种回溯
        for(int i = 1; i <= s1.length; i ++){
            for(int j = 1; j <= t1.length; j ++){
                if(s1[i - 1] == t1[j - 1])f[i][j] = f[i - 1][j - 1] + 1;
                else {f[i][j] = Math.max(f[i][j - 1],f[i - 1][j]);
            }
        }

        int x = s1.length - 1, y = t1.length - 1;
        while(f[x + 1][y + 1] > 0){
            if(s1[x] == t1[y]){
                sb.append(s1[x]);
                x--;y--;
            }
            else{
                if(f[x + 1][y + 1] == f[x + 1][y])y--;
                else x--;
            }
        }
        */

         System.out.println(sb.reverse().toString());
    }
}