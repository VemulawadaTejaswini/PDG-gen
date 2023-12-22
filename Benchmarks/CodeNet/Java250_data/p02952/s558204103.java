import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        if (n < 10) {
            c = n;//1..n
        } else if (n < 100) {
            c = 9;//1...9
        } else if (n < 1_000) {
            c = n - 90;// 1..9,100..n -> n - 99 + 9
        } else if (n < 10_000) {
            c = 909;//1..9,100..999 -> 999 - 99 + 9
        } else if (n < 100_000) {
            c = n - 9090;//1..9,100..999,10000..n -> n - 9999 + 999 - 99 + 9
        } else {
            c = 90909;//1..9,100..999,10000..99999 -> 99999 - 9999 + 999 - 99 + 9
        }
        System.out.println(c);
    }
}
