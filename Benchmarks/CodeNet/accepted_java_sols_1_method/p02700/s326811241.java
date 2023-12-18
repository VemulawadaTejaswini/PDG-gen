import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 高橋 体力
        int b = sc.nextInt(); // 高橋 攻撃力
        int c = sc.nextInt(); // 青木 体力
        int d = sc.nextInt(); // 青木 攻撃力

        for (int i = 1; a > 0 && c > 0; i++) {
            if (i % 2 == 0) {
                a = a - d;
            } else {
                c = c - b;
            }
        }

        if (a > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}