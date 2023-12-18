import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 1;
        for (int i = 0 ; i < N ; i++) {
            long a = scanner.nextLong();
            result *= a;
        }
        
        if (String.valueOf(result).length() >= 18) {
            System.out.println(-1);
            return;
        }

        System.out.println(result);
    }
}
