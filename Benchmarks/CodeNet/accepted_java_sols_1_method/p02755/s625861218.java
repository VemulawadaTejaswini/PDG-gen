import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        double aa = a * 100 / 8.0;
        double bb = b * 10;
        double la = (a + 1) * 100 / 8.0;
        double lb = (b + 1) * 10;
        if (aa == bb) {
            System.out.println((int)aa);
        } else if (aa > bb) {
            if (bb <= aa && aa < lb) {
                System.out.println((int)Math.ceil(aa));
            } else {
                System.out.println(-1);
            }
        } else {
            if (aa <= bb && bb < la) {
                System.out.println((int)Math.ceil(bb));
            } else {
                System.out.println(-1);
            }
        }
    }
}