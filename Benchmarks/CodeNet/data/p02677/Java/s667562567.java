import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    static int readOneInt() {
        String line = SCANNER.nextLine();
        return Integer.parseInt(line);
    }

    public static void main(String[] args) {

//        int tc = Integer.parseInt(SCANNER.nextLine());
        int tc = 1;
        for (int i = 0; i < tc; ++i) {
            String s = SCANNER.nextLine();
            String[] str = s.split(" ");
            int[] ints = new int[str.length];
            for (int j  = 0; j < str.length; ++j) {
                ints[j] = Integer.parseInt(str[j]);
            }
            test(ints[0], ints[1], ints[2], ints[3]);
        }
    }

    private static void test(int a, int b, int h, int m) {
        double full = 2 * Math.PI;

        double ba = full * (m / 60.0);
        double aa = full * (h * 60 + m) / 12.0 / 60.0;

        double ax = a * Math.sin(aa);
        double ay = a * Math.cos(aa);

        double bx = b * Math.sin(ba);
        double by = b * Math.cos(ba);

        double dx = bx - ax;
        double dy = by - ay;

        double d = Math.sqrt(dx*dx + dy*dy);
        System.out.println(d);
    }

}

