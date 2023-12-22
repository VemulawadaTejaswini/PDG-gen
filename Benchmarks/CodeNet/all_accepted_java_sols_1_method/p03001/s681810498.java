import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int W = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 組み合わせ
        int pattern = 0;
        if (2 * x == W && 2 * y == H) {
            pattern++;
        }

        // 面積
        double rect = (double) H * W / 2;

        System.out.println(rect + " " + pattern);
    }
}
