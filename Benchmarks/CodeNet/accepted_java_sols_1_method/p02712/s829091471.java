import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long total = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                total += i;
            }
        }

        System.out.println(total);
    }
}
