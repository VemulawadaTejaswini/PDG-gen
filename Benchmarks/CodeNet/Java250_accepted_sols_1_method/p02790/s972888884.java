import java.util.Scanner;

/**
 * TITLE : Comparing Strings
 * URL : https://atcoder.jp/contests/abc152/tasks/abc152_b
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer;

        if (a < b) {
            answer = a;
            for (int i = 1; i < b; i++) {
                answer = answer * 10 + a;
            }
        } else {
            answer = b;
            for (int i = 1; i < a; i++) {
                answer = answer * 10 + b;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}