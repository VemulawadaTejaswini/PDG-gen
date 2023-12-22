import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int min = Math.min(x, y);
        int del = Math.max(x, y) - min;

        int ans = Math.min(a + b, 2 * c) * min + Math.min((min == x) ? b : a, 2 * c) * del;

        println(ans);
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
