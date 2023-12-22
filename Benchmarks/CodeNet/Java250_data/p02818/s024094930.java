import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long K = scanner.nextLong();

        long AA  = Math.max(0, A - K);
        long BB = B;
        if(0 > A - K) {
            BB = Math.max(0, B + (A - K));
        }

        System.out.println(AA);
        System.out.println(BB);
    }
}