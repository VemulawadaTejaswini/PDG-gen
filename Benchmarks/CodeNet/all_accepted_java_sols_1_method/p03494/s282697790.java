import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            // スペース区切りの整数の入力
            x[i] = sc.nextInt();
        }

        int cnt = 0;
        boolean b = true;
        while (b) {
            for (int i = 0; i < n; i++) {
                if (x[i] % 2 == 0) {
                    x[i] = x[i] / 2;
                } else {
                    b = false;
                    break;
                }
            }
            if (b) {
                cnt++;
            } else {
                break;
            }
        }

        // 出力
        System.out.println(cnt);
    }

}
