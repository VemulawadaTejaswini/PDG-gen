import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.next());

        for (int i = 0; i < num; i++) {
            int a = Integer.valueOf(sc.next());
            int b = Integer.valueOf(sc.next());
            int c = Integer.valueOf(sc.next());
            System.out.println(isRightTriangle(a, b, c) ? "YES" : "NO");
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a) + (b * b) == (c * c);
    }
}