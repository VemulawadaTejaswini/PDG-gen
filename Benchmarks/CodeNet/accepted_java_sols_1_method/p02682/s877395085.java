import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 1 が書かれたカード
        int B = sc.nextInt(); // 0 が書かれたカード
        int C = sc.nextInt(); // -1 が書かれたカード
        int K = sc.nextInt(); // 取る枚数

        int ans = 0;
        int nokori = K;

        if (A >= nokori) {
            System.out.println(K);
        } else {
            nokori = nokori - A;
            if (B >= nokori) {
                ans = A;
                System.out.println(ans);
            } else {
                nokori = nokori - A - B;
                ans = ans - nokori;
                System.out.println(ans);
            }
        }
    }
}