import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxr = 0;
        int r = 0;
        int t = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = s.nextInt();
            if (tmp % 10 == 0) {
                t += tmp;
            } else {
                r = 10 - tmp % 10;
                t += tmp + r;
                if (maxr < r) {
                    maxr = r;
                }
            }
        }
        s.close();

        System.out.println(t - maxr);
    }
}