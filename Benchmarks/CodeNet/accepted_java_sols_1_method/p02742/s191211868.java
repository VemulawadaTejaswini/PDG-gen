import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        if (h == 1 || w == 1) ans = 1;
        else {
            double tmp_odd;
            double tmp_even;
            if (h % 2 == 0) {
                tmp_odd = (int) Math.ceil(h / 2);
                tmp_even = (int) Math.ceil(h / 2);
            } else {
                tmp_odd = (int) Math.ceil(h / 2);
                tmp_even = (int) Math.ceil((h - 1) / 2);
            }
            if (w % 2 == 0) {
                ans = (long) (tmp_odd * (Math.ceil(w / 2))) + (long) (tmp_even * (Math.ceil(w / 2)));
            } else {
                ans = (long) (tmp_odd * (Math.ceil(w / 2))) + (long) (tmp_even * (Math.ceil(w / 2) - 1));
            }
        }
        System.out.println(ans);
    }
}