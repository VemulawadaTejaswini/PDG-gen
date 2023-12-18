import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int p = std.nextInt();
        int q = std.nextInt();
        int r = std.nextInt();

        int max = Math.max(Math.max(p, q), r);

        System.out.println(p + q + r - max);
    }
}
