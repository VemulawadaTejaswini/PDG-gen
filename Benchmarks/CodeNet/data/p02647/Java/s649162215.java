import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] power = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            power[i] = sc.nextInt();
        }

        int[] nextPower = new int[n + 1];
        for (int t = 0; t < k; t++) {
            // 左右 i + power[i] + 0.5 の範囲を照らす
            for (int i = 1; i <= n; i++) {
                if (power[i] == 0) {
                    // 自分自身のみカウント
                    nextPower[i]++;
                } else {
                    int rengeLeft  = i - power[i];
                    int rengeRight = i + power[i];

                    if (rengeLeft <= 0) {
                        rengeLeft = 1;
                    }

                    if (rengeRight > n) {
                        rengeRight = n;
                    }

                    for (int j = rengeLeft; j <= rengeRight; j++) {
                        nextPower[j]++;
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                power[i] = nextPower[i];
                nextPower[i] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.print(power[i] + " ");
        }
        System.out.println(power[n]);
    }
}