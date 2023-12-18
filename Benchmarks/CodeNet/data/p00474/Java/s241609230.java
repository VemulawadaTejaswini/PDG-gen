import java.util.Scanner;

public class Main {
    static final char nULL = '\0';

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 入力の 1 行目には,つららの本数を表す整数 n とつららの限界の長さを表す整数 L が,空白を区切りとしてこの順に書かれている.
        // 入力の i + 1 行目 (1 &#8804; i &#8804; n) に は, i 本目のつららの最初の長さを表す整数 ai (1 &#8804; ai < L)
        // が書かれている.
        int n = sc.nextInt();
        int L = sc.nextInt();
        int[] ice = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            ice[i] = sc.nextInt();
        }
        int t = 1;
        while (true) {
            boolean flag = true;
            int[] a = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                a[i] = ice[i];
            }
            for (int i = 1; i <= n; i++) {
                if (ice[i] != 0)
                    flag = false;
                if (a[i] > a[i - 1] && a[i] > a[i + 1])
                    ice[i]++;
                if (ice[i] >= L)
                    ice[i] = 0;
            }
            if (flag) {
                System.out.println(t-1);
                break;
            }
            t++;
        }
    }
}