import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 1;
        for (int i = 0 ; i < N ; i++) {
            long a = scanner.nextLong();
            int srcLen = String.valueOf(result).length();
            int distLen = String.valueOf(a).length();
            if (srcLen + distLen >= 18) {
                System.out.println(-1);
                return;
            }
            result *= a;
        }

        System.out.println(result);
    }
}