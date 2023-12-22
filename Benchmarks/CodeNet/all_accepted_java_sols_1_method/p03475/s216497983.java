import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] c = new int[n-1];  // 次の駅までの所要時間
        int[] s = new int[n-1];  // 始発時間
        int[] f = new int[n-1];  // 発車間隔

        for (int i = 0; i < n-1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        for (int i = 0; i < n-1; i++) {
            int time = 0;
            for (int j = i; j < n-1; j++) {
                if (time < s[j])  // 一駅運航なので始発まで待つ
                    time = s[j];
                else if (time % f[j] != 0)
                    time += f[j] - (time % f[j]);

                time += c[j];
            }
            ans[i] = time;
        }

        // 出力
        for (int i : ans)
            System.out.println(i);
    }
}
