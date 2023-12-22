import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] aa = new int[n];
            int[] ab = new int[n];
            int sa = 0;
            int sb = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) {
                    sa = sa + a + b;
                } else if (b > a) {
                    sb = sb + a + b;
                } else if (a == b) {
                    sa += a;
                    sb += b;
                }
            }
            System.out.println(sa + " " + sb);
        }
    }
}