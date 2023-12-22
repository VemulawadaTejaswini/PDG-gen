import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if(A < 1 || A > 9 || B < 1 || B > 9) {
            System.out.println(-1);
            return;
        }

        System.out.println(A * B);
    }
}