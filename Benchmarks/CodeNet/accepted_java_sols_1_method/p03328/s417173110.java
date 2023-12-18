import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sa = b - a;
        int sum = 0;
        for (int i = sa; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum - b);
    }
}