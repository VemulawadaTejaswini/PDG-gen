import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 配列
        int[] x = new int[m];
        int[] y = new int[m];
        for(int i=0;i<m;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean[] prob = new boolean[n+1];
        Arrays.fill(prob, false);
        prob[1] = true;

        int[] ball = new int[n+1];
        Arrays.fill(ball, 1);
        ball[0] = 0;

        for(int i=0;i<m;i++){
            ball[x[i]]--;
            ball[y[i]]++;
            if(prob[x[i]]) {
                prob[y[i]] = true;
            }
            if(ball[x[i]] == 0) {
                prob[x[i]] = false;
            }
        }

        int ans = 0;
        for (int i =1;i<=n;i++) {
            if(prob[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
