import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // A個口のタップ
        int B = sc.nextInt(); // ゴール

        int sum = 1;   // 口数の合計
        int count = 0; // 電源タップの数
        while (sum < B) {
            sum += (A -1);
            count++;
        }

        System.out.print(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}