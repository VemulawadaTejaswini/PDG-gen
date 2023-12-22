import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[][] = new int[2][n];
        int candies = 0;

        for (int i = 0; i < n; i++) {
            a[0][i] = sc.nextInt();
        }
        candies += a[0][0];     // 0番目で曲がった時の計算用

        for (int i = 0; i < n; i++) {
            a[1][i] = sc.nextInt();
            candies += a[1][i];     // 0番目で曲がった時の計算用
        }

//        int best_n = 0;
        int best_score = candies;     // 0番目で曲がった時のカウント
        for (int i = 1; i < n; i++) {        // n番目で曲がる
            candies += a[0][i];
            candies -= a[1][i-1];
            if (candies > best_score) {
//                best_n = n;
                best_score = candies;
            }
        }
        System.out.println(best_score);
    }
}
