import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            int sum = 0;
            int min = 100000000;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int p = scanner.nextInt();
                sum += p;
                if (p > max) max = p;
                if (p < min) min = p;
            }
            System.out.println((sum - min - max) / (n -2));
        }
        scanner.close();
    }
}

