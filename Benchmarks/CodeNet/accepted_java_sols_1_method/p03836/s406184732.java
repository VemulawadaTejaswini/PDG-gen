import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final long MOD = 1000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sx = in.nextInt();
        int sy = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();

        // first going
        for (int i = 0; i < ty - sy; i++) {
            System.out.print("U");
        }
        for (int i = 0; i < tx - sx; i++) {
            System.out.print("R");
        }

        // first return
        for (int i = 0; i < ty - sy; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < tx - sx; i++) {
            System.out.print("L");
        }

        // second going
        System.out.print("L");
        for (int i = 0; i < ty - sy + 1; i++) {
            System.out.print("U");
        }
        for (int i = 0; i < tx - sx + 1; i++) {
            System.out.print("R");
        }
        System.out.print("D");

        // second return
        System.out.print("R");
        for (int i = 0; i < ty - sy + 1; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < tx - sx + 1; i++) {
            System.out.print("L");
        }
        System.out.print("U");
    }
}