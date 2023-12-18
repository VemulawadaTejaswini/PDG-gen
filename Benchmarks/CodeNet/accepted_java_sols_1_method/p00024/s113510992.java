import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double limit = Double.parseDouble(sc.next());

            double v = 0;
            double y = 0;

            int K = 0;
            while (v < limit) {
                K++;
                y = 5 * K - 5;
                v = 9.8 * Math.sqrt(y / 4.9);
            }
            System.out.println(K);
        }
    }
}