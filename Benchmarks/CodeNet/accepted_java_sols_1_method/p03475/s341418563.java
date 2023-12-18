import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < n-1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        //i駅からスタート
        for (int i = 0; i < n; i++) {
            long time = 0;
            //j駅までの時間を求める。
            for (int j = i; j < n-1; j++) {
                //開通出発時間が経過時間よりも後のとき
                if (time < s[j]) {
                    time = s[j];
                } else {
                    //経過時間が定期出発時間の何秒前に到着するか
                    if (time % f[j] > 0) {
                        time += f[j] - time % f[j];
                    }
                }
                //駅までの到着時間
                time += c[j];
            }
            System.out.println(time);
        }
    }
}
