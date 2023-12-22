import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int W = sc.nextInt();

        final String[] c = new String[H];

        for (int i = 0; i < H; i++) {
            c[i] = sc.next();
        }

        for (int i = 0; i < H; i++) {
            System.out.println(c[i]);
            System.out.println(c[i]);
        }
    }
}
