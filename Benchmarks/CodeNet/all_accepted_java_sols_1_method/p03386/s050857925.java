import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        for(int i = A; i <= B; i++) {
            if ( i < A + K || B - K < i) {
                System.out.println(i);
            }
        }

    }
}
