import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        double p = 0;
        while (true) {
            n = input.nextInt();
            m = input.nextInt();
            p = input.nextDouble();
            if (n == 0 && m == 0 && p == 0) break;
            int number = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int ele = input.nextInt();
                sum += ele*100;
                if (i + 1 == m) {
                    number = ele;
                }
            }
            if (number == 0) {
                System.out.println(0);
                continue;
            }
            double win = sum*(100-p)/100;
            int ans = (int) Math.floor(win/number);
            System.out.println((int) ((sum - sum*(p*0.01))/number));
        }
    }
}
