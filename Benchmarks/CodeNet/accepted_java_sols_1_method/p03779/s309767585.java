import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();

        long total = 0;
        for (int i = 1;; i++) {
            if (total >= x) {
                System.out.println(i - 1);
                return;
            }
            total += i;
        }
    }
}
