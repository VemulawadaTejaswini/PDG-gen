import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int k = sc.nextInt();

        int x = sc.nextInt();

        if (x <= 500 * k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}