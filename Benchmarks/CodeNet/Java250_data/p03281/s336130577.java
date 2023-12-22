import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i = i+2) {
            int divisor = divisorCounter(i);
            if (divisor == 8) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static int divisorCounter(int x) {
        int counter = 0;
        for (int i = 1; i <= x; i++) {
            if (x%i == 0) {
                counter++;
            }
        }
        return counter;
    }
}