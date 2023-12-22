import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int k = kbd.nextInt();
        double pt = 1.0 * 1 / n;
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            int counter = i;
            double temp = pt;
            while (counter < k) {
                temp = temp * 0.5;
                counter = counter * 2;
            }
            sum = sum + temp;
        }
        System.out.println(sum);
        // int point = 0;
        // point = point + dice(n);
        // while (point >= 1 && k - 1 >= point) {
        // int temp = coin();
        // if (temp == 0) {
        // point = point * 2;
        // } else {
        // point = 0;
        // }
        // }
        // if (point != 0) {

        // }
    }

    // static int dice(int n) {
    // Random ran = new Random();
    // return ran.nextInt(n) + 1;
    // }

    // static int coin() {
    // Random ran = new Random();
    // return ran.nextInt(2);
    // }
}
