import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc172/tasks/abc172_a
 * 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((int) (a + Math.pow(a, 2) + Math.pow(a, 3)));
    }
}