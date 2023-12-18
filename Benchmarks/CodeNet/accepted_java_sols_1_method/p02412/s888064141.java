import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n == 0 && x == 0) break;

            int result = 0;
            for (int i = 1; i < n+1; i++) {
                for (int j = i+1; j < n+1; j++) {
                    for (int k = j+1; k < n+1; k++) {
                        if (i + j + k == x) result++;
                    }
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }
}

