import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 入力受付
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (1 <= a && a <= 9 && 1 <= b && b <= 9) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }

    }

}