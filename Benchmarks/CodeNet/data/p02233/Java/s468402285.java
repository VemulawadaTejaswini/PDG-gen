import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;

        int result = 0;
        int preOldResult = 1;
        int oldResult = 1;

        for (int i = 2; i <= n; i++) {
            result = preOldResult + oldResult;
            preOldResult = oldResult;
            oldResult = result;
        }

        return result;
    }
}