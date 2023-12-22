import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H1 = scanner.nextInt();
        int M1 = scanner.nextInt();
        int H2 = scanner.nextInt();
        int M2 = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(H2 * 60 + M2 - (H1 * 60 + M1) - K);

        
    }
}
