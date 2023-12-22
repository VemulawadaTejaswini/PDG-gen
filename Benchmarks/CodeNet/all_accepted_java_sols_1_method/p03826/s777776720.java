import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a b c d)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int s1 = a * b;
        int s2 = c * d;
        System.out.println((s1 >= s2) ? s1 : s2);
        sc.close();
    }
}