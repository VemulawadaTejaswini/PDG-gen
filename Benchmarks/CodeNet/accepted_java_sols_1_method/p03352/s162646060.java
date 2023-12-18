import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int max = 1;
        for (int i = 2; i <= 1000; i++) {
            int e = i;
            while (e <= x) {
                e *= i;
            }

            if (e / i != i) {
                max = Math.max(e / i, max);
            }
        }

        System.out.println(max);
    }
}
