import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        int prev = (H[0] > 1) ? H[0] - 1 : H[0];

        for (int i = 1; i < N - 1; i++) {
            int target = H[i];
            int next = H[i + 1];

            // next が target より 2以上低い場合は無理
            if ((target - next) > 1) {
                System.out.println("No");
                return;
            } else if ((target - next) == 1) {
                // next が target より 1低い場合は、target を 1下げた結果を prev と比較する
                target -= 1;
                if (prev > target) {
                    System.out.println("No");
                    return;
                }
            } else {
                // next が target の高さ以上の場合、target と prev を比較して target を下げられる場合は下げる
                if (prev < target) {
                    target -= 1;
                }
            }

            prev = target;
        }

        System.out.println("Yes");
    }
}
