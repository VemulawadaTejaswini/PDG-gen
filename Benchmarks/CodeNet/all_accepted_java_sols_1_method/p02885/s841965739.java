import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_a

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // === ans1 ===
        int ans = a - b * 2;
        if(0 <= ans) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }

   
    }
}