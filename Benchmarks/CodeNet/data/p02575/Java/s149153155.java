
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/12 6:54 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] ans = new int[w+1][h+1];
        int[] l = new int[w+1];
        int[] r = new int[w+1];
        for(int i = 1;i<=h;i++){
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        for(int j = 1;j<=w;j++) {
            int right = j;
            for (int i = 1; i <= h; i++) {
                if (ans[j][i-1] == -1) {
                    ans[j][i] = -1;
                    continue;
                }
                if (right < l[i]) {
                    ans[j][i] = ans[j][i-1] + 1;
                } else {
                    int tmp = Math.max(r[i] + 1, right);
                    if (tmp <= w) {
                        ans[j][i] = ans[j][i-1] + 1 + tmp - right;
                        right = tmp;
                    } else {
                        ans[j][i] = -1;
                    }
                }
            }
        }
        for(int i = 1;i<=h;i++){
            int min = -1;
            for(int j=1;j<=w;j++){
                if(ans[j][i] != -1) {
                    if(min != -1) {
                        min = Math.min(ans[j][i], min);
                    }else{
                        min = ans[j][i];
                    }
                }
            }
            System.out.println(min);
        }
    }
}
